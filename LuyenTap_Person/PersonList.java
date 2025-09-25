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
        for (Person person : personList) {
            person.displayDetails();
        }
        System.out.println("-> Display success");
    }

    public boolean updatePersonById(String id) {
        for (Person person : personList) {
            if (id.equals(person.getId())) {
                person.updatePerson();
                System.out.println("-> Update success");
                return true;
            }
        }
        System.out.println("The person with ID " + id + " not found!");
        return false;
    }

    public boolean deletePersonById(String id) {
        for (int i = 0; i < personList.size(); i++) {
            if (id.equals(personList.get(i).getId())) {
                personList.remove(i);
                System.out.println("-> Delete success");
                return true;
            }
        }
        System.out.println("The person with ID " + id + " not found!");
        return false;
    }

    public Person findPersonById(String id) {
        for (Person person : personList) {
            if (id.equals(person.getId())) {
                person.displayDetails();
                System.out.println("-> Find success");
                return person;
            }
        }
        System.out.println("The person with ID " + id + " not found!");
        return null;
    }

    public ArrayList<Student> findStudentsWithScholarship() {
        ArrayList<Student> scholarshipStudents = new ArrayList<>();
        for (Person person : personList) {
            if (person instanceof Student && person.getGpa() > 3.5) {
                scholarshipStudents.add((Student) person);
            }
        }
        System.out.println("-> Find students with scholarship success");
        return scholarshipStudents;
    }


    public ArrayList<Student> findTop3Students() {
        ArrayList<Student> students = new ArrayList<>();
        for (Person person : personList) {
            if (person instanceof Student) {
                students.add((Student) person);
            }
        }
        students.sort((s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()));
        ArrayList<Student> top3 = new ArrayList<>();
        for (int i = 0; i < Math.min(3, students.size()); i++) {
            top3.add(students.get(i));
        }
        System.out.println("-> Find top 3 students success");
        return top3;
    }

    public Teacher findTeacherWithHighestIncome() {
        Teacher highestIncomeTeacher = null;
        double maxIncome = 0;
        for (Person person : personList) {
            if (person instanceof Teacher) {
                double income = person.calculateIncome();
                if (income > maxIncome) {
                    maxIncome = income;
                    highestIncomeTeacher = (Teacher) person;
                }
            }
        }
        if (highestIncomeTeacher != null) {
            System.out.println("-> Find teacher with highest income success");
        } else {
            System.out.println("No teacher found.");
        }
        return highestIncomeTeacher;
    }

    public void Count() {
        int countStudent = 0;
        int countTeacher = 0;
        for (Person person : personList) {
            if (person instanceof Student) {
                countStudent++;
            } else if (person instanceof Teacher) {
                countTeacher++;
            }
        }
        System.out.println("- Number of students: " + countStudent);
        System.out.println("- Number of teachers: " + countTeacher);
        System.out.println("- Total number of person: " + personList.size());
    }
}
