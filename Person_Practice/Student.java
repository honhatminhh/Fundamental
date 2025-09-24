
package Person_Practice;

import java.util.Date;


public class Student extends Person {
    private double gpa;
    private double tuitionFee;

    public Student(double gpa, double tuitionFee, String id, String name, Date dateOfBirth) {
        super(id, name, dateOfBirth);
        this.gpa = gpa;
        this.tuitionFee = tuitionFee;
    }

    public Student() {
        
    }

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
    public void addPerson()
    {
        super.addPerson();
        System.out.print("Nhap gpa: ");
        gpa = Double.parseDouble(s.nextLine());
        System.out.print("Nhap le phi: ");
        tuitionFee = Double.parseDouble(s.nextLine());
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
        System.out.println("GPA: "+gpa);
        System.out.println("Le phi: "+tuitionFee);
    }
    @Override
    public double calculateIncome()
    {
        double income=0;
        if (gpa >3.5)
        {
            income = tuitionFee / 2;
            return income;
        } else
        {
            return income;
        }
    }
}
