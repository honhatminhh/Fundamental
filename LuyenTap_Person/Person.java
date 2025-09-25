package LuyenTap_Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public abstract class Person implements IPerson {
    String id;
    String name;
    Date dateOfBirth;
    Scanner scanner = new Scanner(System.in);
    public Person() {
    }

    public Person(String id, String name, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
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

    public void addPerson() {
        System.out.print("Input ID: ");
        setId(scanner.nextLine());
        System.out.print("Input Name: ");
        setName(scanner.nextLine());
        System.out.print("Input date of birth: ");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = scanner.nextLine();
        try {
            setDateOfBirth(formatter.parse(strDate));
        } catch (ParseException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void displayDetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("ID: " + getId() + ", Name: " + getName() + ", Date of birth: " + sdf.format(getDateOfBirth()));
    }

    public void updatePerson() {
        System.out.print("Name: ");
        setName(scanner.nextLine());
        System.out.print("Date of birth: ");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = scanner.nextLine();
        try {
            setDateOfBirth(formatter.parse(strDate));
        } catch (ParseException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    public abstract double calculateIncome();
    public abstract double getGpa();
}
