package Room;
import java.util.*;
import java.text.*;
public class Run {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        RoomList list = new RoomList();
        int choice;
        do{
        
        System.out.println("\n==========MENU==========");
        System.out.println("0. Exit");
        System.out.println("1. Add a new Meeting Room");
        System.out.println("2. Add a new Bedroom");
        System.out.println("3. Update a room by ID");
        System.out.println("4. Delete a room by ID");
        System.out.println("5. Find a room by ID");
        System.out.println("6. Display all rooms");
        System.out.println("7. Find the most expensive room");
        System.out.println("8. Count the total number of Meeting Rooms and Bedrooms");
        System.out.println("========================");
        System.out.print("Chon 1 tinh nang: ");
        choice = Integer.parseInt(s.nextLine());
        switch(choice)
        {
            case 0: break;
            case 1: Room meetingroom = new MeetingRoom();
            list.addRoom(meetingroom); break;
            case 2: Room bedroom = new BedRoom();
            list.addRoom(bedroom); break;
            case 3: System.out.print("Nhap ID phong muon cap nhat: ");
            String updateID = s.nextLine();
            list.updateRoomByID(updateID);
            break;
            case 4: System.out.print("Nhap ID phong muon xoa: ");
            String deleteID = s.nextLine();
            list.deleteRoom(deleteID);
            break;
            case 5: System.out.print("Nhap ID phong muon tim: ");
            String findID = s.nextLine();
            list.findRoomByID(findID);
            break;
            case 6: list.displayRoom();
            break;
            case 7: list.findMostExpensiveRoom();
            break;
            case 8: list.countRooms();
            break;
            default: System.out.println("Lua chon khong hop le, vui long chon lai!");
            break;
        }
        } while(choice !=0);
        s.close();
    }
}
