
package LuyenTap_Person;

import java.util.Date;
import java.util.Scanner;

public class Teacher extends Person {
    private int numberOfClasses;
    private double baseSalary;

    public Teacher() {
    }

    public Teacher(int numberOfClasses, double baseSalary, String id, String name, Date dateOfBirth) {
        super(id, name, dateOfBirth);
        this.numberOfClasses = numberOfClasses;
        this.baseSalary = baseSalary;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void addPerson(){
        super.addPerson();
        System.out.print("Number of classes: ");
        setNumberOfClasses(Integer.parseInt(scanner.nextLine()));
        System.out.print("Base salary: ");
        setBaseSalary(Double.parseDouble(scanner.nextLine()));
    }
    public void updatePerson(){
        super.updatePerson();
        System.out.print("Number of classes: ");
        setNumberOfClasses(Integer.parseInt(scanner.nextLine()));
        System.out.print("Base salary: ");
        setBaseSalary(Double.parseDouble(scanner.nextLine()));
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println(", Number of classes: " + getNumberOfClasses() + ", Base salary: " + getBaseSalary() + ", Income: " + calculateIncome());
    }
    
    @Override
    public double calculateIncome() {
        return getNumberOfClasses() * getBaseSalary();
    }

    @Override
    public double getGpa() {
        return 0;
    }
}
