package Room;
import java.util.*;
public class BedRoom extends Room{
	private int numOfBed;
	public BedRoom() {}
	public BedRoom(String ID, String name, double baseCost, int numOfBed)
	{
		super(ID,name,baseCost);
		this.numOfBed = numOfBed;
	}
	@Override
    public void addRoom(){
        super.addRoom();
        System.out.print("- Enter number of beds: ");
        numOfBed = Integer.parseInt(s.nextLine());
        setBaseCost(calculateCost());
    }
    
    @Override
    public void updateRoom(){
        System.out.print("Enter new ID to update: ");
        String newID = s.nextLine();
        setID(newID);
    }
    
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("- Number of beds: " + numOfBed);
        System.out.println("- Cost: " + calculateCost());
        System.out.println("==========================");
    }
    
    @Override
    public double calculateCost() {
        double result = (numOfBed >= 3)? getBaseCost() + (getBaseCost() * 0.1) : getBaseCost();
        return result;
    }
}
