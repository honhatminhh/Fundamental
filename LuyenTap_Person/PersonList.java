
package LuyenTap_Person;

import java.util.ArrayList;
import java.util.Collections;

public class PersonList {

    ArrayList<Person> personList = new ArrayList<>();

    public void addPerson(Person person) {
        person.addPerson();
        personList.add(person);
        System.out.println("-> Add success");
    }

    public void displayAll() {
        for (int i = 0; i < personList.size(); i++) {
            personList.get(i).displayDetails();
        }
        System.out.println("-> Display success");
    }

    public boolean updatePersonById(String id) {
        int index = -1;
        for (int i = 0; i < personList.size(); i++) {
            if (id.equals(personList.get(i).getId())) {
                index = 0;
                personList.get(i).updatePerson();
                System.out.println("-> Update success");
                break;
            }
        }
        if (index != -1) {
            return true;
        } else {
            System.out.println("The person with ID " + id + " not found!");
            return false;
        }
    }

    public boolean deletePersonById(String id) {
        int index = -1;
        for (int i = 0; i < personList.size(); i++) {
            if (id.equals(personList.get(i).getId())) {
                index = 0;
                personList.remove(i);
                System.out.println("-> Delete success");
                break;
            }
        }
        if (index != -1) {
            return true;
        } else {
            System.out.println("The person with ID " + id + " not found!");
            return false;
        }
    }

    public boolean findPersonById(String id) {
        int index = -1;
        for (int i = 0; i < personList.size(); i++) {
            if (id.equals(personList.get(i).getId())) {
                index = 0;
                personList.get(i).displayDetails();
                System.out.println("-> Find success");
                break;
            }
        }
        if (index != -1) {
            return true;
        } else {
            System.out.println("The person with ID " + id + " not found!");
            return false;
        }
    }

    public void findTop3Students() {
        for (int i = 0; i < personList.size(); i++) {
            for (int k = i + 1; k < personList.size(); k++) {
                if (personList.get(i).getGpa() < personList.get(k).getGpa()) {
                    Collections.swap(personList, i, k);
                }
            }
        }
        System.out.print("- 1st Student: ");
        personList.get(0).displayDetails();
        System.out.print("- 2nd Student: ");
        personList.get(1).displayDetails();
        System.out.print("- 3rd Student: ");
        personList.get(2).displayDetails();
        System.out.println("-> Find top 3 students success");
    }

    public void findTeacherWithHighestIncome() {
        double max = 0;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i) instanceof Teacher && personList.get(i).calculateIncome() > max) {
                max = personList.get(i).calculateIncome();
            }
        }
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i) instanceof Teacher && personList.get(i).calculateIncome() == max) {
                personList.get(i).displayDetails();
                System.out.println("-> Find teacher with highest income success");
                break;
            }
        }
    }

    public void findStudentsWithScholarship() {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getGpa() > 3.5) {
                personList.get(i).displayDetails();
            }
        }
        System.out.println("-> Find students with scholarship success");
    }

    public void Count() {
        int countStudent = 0;
        int countTeacher = 0;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i) instanceof Student) {
                countStudent++;
            } else {
                countTeacher++;
            }
        }
        System.out.println("- Number of students: " + countStudent);
        System.out.println("- Number of teachers: " + countTeacher);
        System.out.println("- Total number of person: " + personList.size());
    }
}