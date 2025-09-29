package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GUI_test {
    private static ArrayList<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Management");
        frame.setSize(900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        // Nhóm nhập liệu bên trái
        JLabel[] labels = {
            new JLabel("ID:"), new JLabel("Name:"), new JLabel("DOB (dd/mm/yyyy):"),
            new JLabel("Address:"), new JLabel("Email:"), new JLabel("GPA:")
        };
        JTextField[] fields = new JTextField[6];
        for (int i = 0; i < labels.length; i++) {
            labels[i].setBounds(20, 20 + i * 40, 150, 25);
            panel.add(labels[i]);
            fields[i] = new JTextField(20);
            fields[i].setBounds(150, 20 + i * 40, 200, 25);
            panel.add(fields[i]);
        }

        // Nhóm nút bên phải
        String[] btnLabels = {"Add", "Search", "Delete", "Display", "Save to File", "Load from File"};
        JButton[] buttons = new JButton[btnLabels.length];
        for (int i = 0; i < btnLabels.length; i++) {
            buttons[i] = new JButton(btnLabels[i]);
            int row = i / 3;
            int col = i % 3;
            buttons[i].setBounds(400 + col * 130, 30 + row * 50, 120, 30);
            panel.add(buttons[i]);
        }

        JButton addBtn = buttons[0];
        JButton searchBtn = buttons[1];
        JButton deleteBtn = buttons[2];
        JButton displayBtn = buttons[3];
        JButton saveBtn = buttons[4];
        JButton loadBtn = buttons[5];

        // Bảng hiển thị
        String[] columnNames = {"ID", "Name", "DOB", "Address", "Email", "GPA"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(tableModel);
        JScrollPane tableScroll = new JScrollPane(table);
        tableScroll.setBounds(20, 300, 840, 250);
        panel.add(tableScroll);

        // Nút sắp xếp
        String[] sortLabels = {"Sort by ID", "Sort by Name", "Sort by GPA"};
        for (int i = 0; i < sortLabels.length; i++) {
            JButton sortBtn = new JButton(sortLabels[i]);
            sortBtn.setBounds(400 + i * 130, 150, 120, 30);
            panel.add(sortBtn);

            if (i == 0) {
                sortBtn.addActionListener(e -> {
                    studentList.sort(Comparator.comparing(Student::getId));
                    displayBtn.doClick();
                });
            } else if (i == 1) {
                sortBtn.addActionListener(e -> {
                    studentList.sort(Comparator.comparing(Student::getName));
                    displayBtn.doClick();
                });
            } else {
                sortBtn.addActionListener(e -> {
                    studentList.sort(Comparator.comparing(Student::getGpa).reversed());
                    displayBtn.doClick();
                });
            }
        }

        // Chức năng các nút
        addBtn.addActionListener(e -> {
            String id = fields[0].getText().trim();
            String name = fields[1].getText().trim();
            String dob = fields[2].getText().trim();
            String address = fields[3].getText().trim();
            String email = fields[4].getText().trim();
            String gpaText = fields[5].getText().trim();
            try {
                double gpa = Double.parseDouble(gpaText);
                if (!id.isEmpty() && !name.isEmpty()) {
                    studentList.add(new Student(id, name, dob, address, email, gpa));
                    JOptionPane.showMessageDialog(frame, "Added student: " + name);
                    for (JTextField f : fields) f.setText("");
                } else {
                    JOptionPane.showMessageDialog(frame, "ID and Name are required.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Invalid GPA.");
            }
        });

        searchBtn.addActionListener(e -> {
            String id = fields[0].getText().trim();
            for (Student s : studentList) {
                if (s.getId().equalsIgnoreCase(id)) {
                    JOptionPane.showMessageDialog(frame, "Found:\n" + s);
                    return;
                }
            }
            JOptionPane.showMessageDialog(frame, "Student not found.");
        });

        deleteBtn.addActionListener(e -> {
            String id = fields[0].getText().trim();
            boolean removed = studentList.removeIf(s -> s.getId().equalsIgnoreCase(id));
            JOptionPane.showMessageDialog(frame, removed ? "Deleted student with ID: " + id : "Student not found.");
        });

        displayBtn.addActionListener(e -> {
            tableModel.setRowCount(0);
            for (Student s : studentList) {
                Object[] row = {s.getId(), s.getName(), s.getDob(), s.getAddress(), s.getEmail(), s.getGpa()};
                tableModel.addRow(row);
            }
        });

        saveBtn.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showSaveDialog(frame);
            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
                    writer.println("ID,Name,DOB,Address,Email,GPA");
                    for (Student s : studentList) {
                        writer.printf("%s,%s,%s,%s,%s,%.2f%n",
                            s.getId(), s.getName(), s.getDob(), s.getAddress(), s.getEmail(), s.getGpa());
                    }
                    JOptionPane.showMessageDialog(frame, "Saved to " + file.getName());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Error saving file.");
                }
            }
        });

        loadBtn.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showOpenDialog(frame);
            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    studentList.clear();
                    tableModel.setRowCount(0);
                    String line = reader.readLine(); // skip header
                    while ((line = reader.readLine()) != null) {
                        String[] parts = line.split(",");
                        if (parts.length == 6) {
                            double gpa = Double.parseDouble(parts[5]);
                            Student s = new Student(parts[0], parts[1], parts[2], parts[3], parts[4], gpa);
                            studentList.add(s);
                            tableModel.addRow(new Object[]{s.getId(), s.getName(), s.getDob(), s.getAddress(), s.getEmail(), s.getGpa()});
                        }
                    }
                    JOptionPane.showMessageDialog(frame, "Loaded from " + file.getName());
                } catch (IOException | NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Error loading file.");
                }
            }
        });

        frame.setVisible(true);
    }
}
