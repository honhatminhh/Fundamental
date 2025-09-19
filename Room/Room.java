package Room;
import java.text.*;
import java.util.*;
public abstract class Room implements IRoom {
	private String ID;
	private String name;
	private double baseCost;
	Scanner s = new Scanner(System.in);
	public Room(String ID, String name, double baseCost) {
        this.ID = ID;
        this.name = name;
        this.baseCost = baseCost;
    }
	public Room() {}

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }
    @Override
    public void addRoom()
    {
    	System.out.print("Nhap id phong: ");
    	ID = s.nextLine();
    	System.out.print("Nhap ten phong: ");
    	name = s.nextLine();
    	System.out.print("Nhap gia phong: ");
    	baseCost = Double.parseDouble(s.nextLine());
    	
    }
    @Override
    public void updateRoom()
    {
    	
    }
    @Override
    public void displayDetails()
    {
    	System.out.println("ID: "+ID);
    	System.out.println("Name: "+name);
    	System.out.println("Cost: "+baseCost);
    }
    @Override
    public abstract double calculateCost();
}
