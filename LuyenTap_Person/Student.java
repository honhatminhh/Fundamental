
package LuyenTap_Person;
import java.util.*;
public class Student extends Person {
    private double gpa;
    private double tuitionFee;

    public Student() {
    }

    public Student(double gpa, double tuitionFee, String id, String name, Date dateOfBirth) {
        super(id, name, dateOfBirth);
        this.gpa = gpa;
        this.tuitionFee = tuitionFee;
    }
    @Override
    public double getGpa() {
        return gpa;
    }   

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    @Override
    public double calculateIncome() {
        if (getGpa() > 3.5) {
            return getTuitionFee() * 0.5;
        } else {
            return 0;
        }
    }
    @Override
    public void addPerson() {
        super.addPerson();
        System.out.print("GPA: ");
        setGpa(Double.parseDouble(scanner.nextLine()));
        System.out.print("Tuition fee: ");
        setTuitionFee(Double.parseDouble(scanner.nextLine()));
    }
    @Override
    public void updatePerson(){
        super.updatePerson();
        System.out.print("GPA: ");
        setGpa(Double.parseDouble(scanner.nextLine()));
        System.out.print("Tuition fee: ");
        setTuitionFee(Double.parseDouble(scanner.nextLine()));
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println(", GPA: " + getGpa() + ", Tuition fee: " + getTuitionFee() + ", Income: " + calculateIncome());
    }
}
