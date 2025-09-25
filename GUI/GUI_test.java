package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class GUI_test {
    private static ArrayList<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Management");
        frame.setSize(850, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        JLabel[] labels = {
            new JLabel("ID:"), new JLabel("Name:"), new JLabel("DOB (dd/mm/yyyy):"),
            new JLabel("Address:"), new JLabel("Email:")
        };
        JTextField[] fields = new JTextField[5];
        for (int i = 0; i < 5; i++) {
            labels[i].setBounds(10, 20 + i * 40, 150, 25);
            panel.add(labels[i]);
            fields[i] = new JTextField(20);
            fields[i].setBounds(160, 20 + i * 40, 200, 25);
            panel.add(fields[i]);
        }

        // Buttons
        JButton addBtn = new JButton("Add");
        JButton searchBtn = new JButton("Search");
        JButton deleteBtn = new JButton("Delete");
        JButton displayBtn = new JButton("Display");
        JButton exportBtn = new JButton("Export");

        JButton[] buttons = {addBtn, searchBtn, deleteBtn, displayBtn, exportBtn};
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setBounds(380, 20 + i * 40, 100, 25);
            panel.add(buttons[i]);
        }

        // table hien thi
        String[] columnNames = {"ID", "Name", "DOB", "Address", "Email"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(tableModel);
        JScrollPane tableScroll = new JScrollPane(table);
        tableScroll.setBounds(10, 240, 660, 250);
        panel.add(tableScroll);

        // Add student
        addBtn.addActionListener(e -> {
            String id = fields[0].getText().trim();
            String name = fields[1].getText().trim();
            String dob = fields[2].getText().trim();
            String address = fields[3].getText().trim();
            String email = fields[4].getText().trim();
            if (!id.isEmpty() && !name.isEmpty()) {
                studentList.add(new Student(id, name, dob, address, email));
                JOptionPane.showMessageDialog(frame, "Added student: " + name);
                for (JTextField f : fields) f.setText("");
            } else {
                JOptionPane.showMessageDialog(frame, "ID and Name are required.");
            }
        });

        // Search student by ID
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

        // Delete student by ID
        deleteBtn.addActionListener(e -> {
            String id = fields[0].getText().trim();
            boolean removed = studentList.removeIf(s -> s.getId().equalsIgnoreCase(id));
            JOptionPane.showMessageDialog(frame, removed ? "Deleted student with ID: " + id : "Student not found.");
        });

        // Display all students in table
        displayBtn.addActionListener(e -> {
            tableModel.setRowCount(0); // clear table
            for (Student s : studentList) {
                Object[] row = {s.getId(), s.getName(), s.getDob(), s.getAddress(), s.getEmail()};
                tableModel.addRow(row);
            }
        });

        // xuat file
        exportBtn.addActionListener(e -> {
            try (PrintWriter writer = new PrintWriter(new FileWriter("students.csv"))) {
                writer.println("ID,Name,DOB,Address,Email");
                for (Student s : studentList) {
                    writer.printf("%s,%s,%s,%s,%s%n",
                        s.getId(), s.getName(), s.getDob(), s.getAddress(), s.getEmail());
                }
                JOptionPane.showMessageDialog(frame, "Exported to students.csv");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Error exporting file.");
            }
        });

        frame.setVisible(true);
    }
}
