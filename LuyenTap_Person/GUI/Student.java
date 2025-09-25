package GUI;
public class Student {
    private String id;
    private String name;
    private String dob;
    private String address;
    private String email;

    public Student(String id, String name, String dob, String address, String email) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.email = email;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getDob() { return dob; }
    public String getAddress() { return address; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", DOB: " + dob +
               ", Address: " + address + ", Email: " + email;
    }
}
