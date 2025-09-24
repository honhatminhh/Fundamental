package Person_Practice;

import java.text.*;
import java.util.*;

public class PersonList {

    ArrayList<Person> arr = new ArrayList<>();
    Scanner s = new Scanner(System.in);

    public void addPerson(Person person) {
        person.addPerson();
        arr.add(person);
        System.out.println("Added!");
    }

    public void displayAll() {
        if (arr.isEmpty()) {
            System.out.println("Danh sach trong!");
        } else {
            for (Person per : arr) {
                per.displayDetails();
            }
        }
    }
    public boolean updatePersonByID(String ID)
    {
        int index=-1;
        for(int i =0;i<arr.size();i++)
        {
            if(arr.get(i).getId().equals(ID))
            {
                index = i;
                break;
            }
        }
        if(index != -1)
        {
            System.out.print("Confirm ID: ");
            String newID = s.nextLine();
            arr.get(index).updatePerson();
            return true;
        } else
        {
            System.out.println("ID khong trung khop!");
            return false;
        }
    }
    public boolean deletePersonByID(String ID)
    {
        int index = -1;
        for(int i =0;i<arr.size();i++)
        {
            if(arr.get(i).getId().equals(ID))
            {
                index = i;
                break;
            }
        }
        if(index != -1)
        {
            arr.remove(index);
            System.out.println("Deleted");
            return true;
        } else
        {
            System.out.println("ID khong khop!");
            return false;
        }
    }
    public Person findPersonByID(String ID)
    {
        for (int i =0;i<arr.size();i++)
        {
            if (arr.get(i).getId().equals(ID))
            {
                System.out.println("Da thay thong tin nguoi can tim!");
                arr.get(i).displayDetails();
                break;
            } else
            {
                System.out.println("ID khong ton tai!");
            }
        }
        return null;
    }
    public Teacher findTeacherWithHighestIncome()
    {
        
    }
    public ArrayList<Student> findTop3Student()
    {
        
    }
    public ArrayList<Student> findStudentWithScholarship()
    {
        
    }
}
