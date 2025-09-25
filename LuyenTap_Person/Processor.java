package LuyenTap_Person;

import java.util.*;

public class Processor {

    public static void main(String[] args) {
        PersonList personList = new PersonList();
        int choose = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nMENU:");
            System.out.println("0. Exit");
            System.out.println("1. Add new student");
            System.out.println("2. Add new teacher");
            System.out.println("3. Update person");
            System.out.println("4. Delete person");
            System.out.println("5. Find person");
            System.out.println("6. Display list");
            System.out.println("7. Find teacher with highest income");
            System.out.println("8. Find top 3 student");
            System.out.println("9. Count");
            System.out.print("Choose method: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    Student student = new Student();
                    personList.addPerson(student);
                    break;
                case 2:
                    Teacher teacher = new Teacher();
                    personList.addPerson(teacher);
                    break;
                case 3:
                    System.out.print("Enter id of the person you want to update: ");
                    personList.updatePersonById(scanner.nextLine());
                    break;
                case 4:
                    System.out.print("Enter id of the person you want to delete: ");
                    personList.deletePersonById(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Enter id of the person you want to find: ");
                    Person found = personList.findPersonById(scanner.nextLine());
                    if (found != null) {
                        found.displayDetails();
                    }
                    break;
                case 6:
                    System.out.println("Person List:");
                    personList.displayAll();
                    break;
                case 7:
                    Teacher topTeacher = personList.findTeacherWithHighestIncome();
                    if (topTeacher != null) {
                        topTeacher.displayDetails();
                    }
                    break;

                case 8:
                    System.out.println("Top 3 students are:");
                    ArrayList<Student> topStudents = personList.findTop3Students();
                    for (int i = 0; i < topStudents.size(); i++) {
                        System.out.print("- " + (i + 1) + " Student: ");
                        topStudents.get(i).displayDetails();
                    }
                    break;
                case 9:
                    personList.Count();
                    break;
                default:
                    System.out.println("Wrong sellection. Please choose again!");
                    break;
            }
            System.out.print("Continue? 1-Yes, 0-No: ");
            choose = Integer.parseInt(scanner.nextLine());
        } while (choose != 0);
    }
}
