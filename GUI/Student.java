package GUI;

public class Student {
    private String id;
    private String name;
    private String dob;
    private String address;
    private String email;
    private double gpa; 

    public Student(String id, String name, String dob, String address, String email, double gpa) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.email = email;
        this.gpa = gpa;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getDob() { return dob; }
    public String getAddress() { return address; }
    public String getEmail() { return email; }
    public double getGpa() { return gpa; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", DOB: " + dob +
               ", Address: " + address + ", Email: " + email + ", GPA: " + gpa;
    }
}
