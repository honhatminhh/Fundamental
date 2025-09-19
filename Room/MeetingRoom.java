package Room;
import java.util.*;
import java.text.*;
public class MeetingRoom extends Room{
	private int capacity;
	public MeetingRoom() {
    }

    public MeetingRoom(String ID, String name, double baseCost, int capacity) {
        super(ID, name, baseCost);
        this.capacity = capacity;
    }
    @Override
    public void addRoom()
    {
    	super.addRoom();
    	System.out.print("Input capacity: ");
    	capacity = Integer.parseInt(s.nextLine());
    }
    @Override
    public void updateRoom()
    {
    	System.out.print("Confirm id pphong muon update:");
    	String newID = s.nextLine();
    	if(getID().equals(newID))
    	{
    		System.out.print("Nhap ID moi: ");
    		String a = s.nextLine();
    		setID(a);
    		}
    	}
    @Override
    public void displayDetails()
    {
    	super.displayDetails();
    	System.out.println("Capacity: "+capacity );
    }
    @Override
    public double calculateCost()
    {
    	if(capacity >50)
    	{
    		return getBaseCost()*1.1;
    	} else
    	{
    		return getBaseCost();
    	}
    }
}
