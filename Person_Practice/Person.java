
package Person_Practice;

import java.text.SimpleDateFormat;
import java.util.*;

public abstract class Person implements IPerson {
    private String id;
    private String name;
    private Date dateOfBirth;
    Scanner s = new Scanner(System.in);
    public Person(String id, String name, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Person() {
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
    @Override
    public void addPerson()
    {
        System.out.print("Nhap id: ");
        id = s.nextLine();
        System.out.print("Nhap ten: ");
        name = s.nextLine();
        System.out.print("Nhap ngay sinh: ");
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/YYYY");
        String strDate = s.nextLine();
        try{
            setDateOfBirth(fmt.parse(strDate));
        } catch(Exception e)
        {
            System.out.println("Loi!");
        }
    }
    @Override
    public boolean updatePerson()
    {
        return true;
    }
    @Override
    public void displayDetails()
    {
        System.out.println("ID: "+id);
        System.out.println("Ten: "+name);
        System.out.println("Ngay sinh: "+dateOfBirth);
    }
    @Override
    public abstract double calculateIncome();
}
