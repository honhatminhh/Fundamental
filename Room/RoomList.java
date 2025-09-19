package Room;
import java.util.*;
public class RoomList {
	ArrayList<Room> arr = new ArrayList<>();
	public void addRoom(Room room)
	{
		room.addRoom();
		arr.add(room);
		System.out.println("Added!!");
	}
	public void displayRoom()
	{
		if(arr.isEmpty())
		{
			System.out.println("Danh sach trong!");
		} else {
		for(Room room : arr)
		{
			room.displayDetails();
		}
		}
	}
	public void countRooms()
	{
		int broom=0,mroom=0;
		for(Room room : arr)
		{
			if(room instanceof MeetingRoom)
			{
				mroom++;
			}else if(room instanceof BedRoom)
			{
				broom++;
			}
		}
		System.out.println("Num of bedroom: "+broom);
		System.out.println("Num of meeting room: "+mroom);
	}
	public boolean updateRoomByID(String ID)
	{
		int index = -1;
		for(int i=0;i<arr.size();i++)
		{
			if(arr.get(i).getID().equals(ID))
			{
				index = i;
				break;
			}
		}
		if(index != -1)
		{
			arr.get(index).updateRoom();
			System.out.println("Updated");
			return true;
		} else
		{
			System.out.println("Id not found");
			return false;
		}
	}
	public boolean deleteRoom(String ID)
	{
		int index = -1;
		for(int i=0;i<arr.size();i++)
		{
			if(arr.get(i).getID().equals(ID))
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
			System.out.println("Id not found");
			return false;
		}
	}
	public Room findRoomByID(String ID)
	{
		for(Room room : arr)
		{
			if(room.getID().equals(ID))
			{
				room.displayDetails();
				return room;
			}
		}
		return null;
	}
	public Room findMostExpensiveRoom() {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).calculateCost() > arr.get(max).calculateCost()) {
                max = i;
            }
        }
        System.out.println("The most expensive room is: " + arr.get(max).getName()
                + " with the amount of: " + arr.get(max).calculateCost());

        return null;
    }
}
