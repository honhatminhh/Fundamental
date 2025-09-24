
package Person_Practice;

import java.util.Date;


public class Teacher extends Person{
    private int numOfClasses;
    private double baseSalary;

    public Teacher(int numOfClasses, double baseSalary, String id, String name, Date dateOfBirth) {
        super(id, name, dateOfBirth);
        this.numOfClasses = numOfClasses;
        this.baseSalary = baseSalary;
    }

    public Teacher() {
    }

    public int getNumOfClasses() {
        return numOfClasses;
    }

    public void setNumOfClasses(int numOfClasses) {
        this.numOfClasses = numOfClasses;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    @Override
    public void addPerson()
    {
        super.addPerson();
        System.out.print("Nhap so lop hoc: ");
        numOfClasses = Integer.parseInt(s.nextLine());
        System.out.print("Nhap luong co ban: ");
        baseSalary = Double.parseDouble(s.nextLine());
        
    }
    @Override
    public boolean updatePerson()
    {
        return true;
    }
    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("So lop hoc: "+numOfClasses);
        System.out.println("Luong: "+baseSalary);
    }
    @Override
    public double calculateIncome()
    {
        double income=0;
        income = numOfClasses*baseSalary;
        return income;
          
    }
}
