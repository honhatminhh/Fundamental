package LEC4;
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so thu tu ngay trong tuan: ");
        int a = s.nextInt();
        switch(a)
        {
            case 2: System.out.println("Monday");
            break;
            case 3: System.out.println("Tuesday");
            break;
            case 4: System.out.println("Wednesday");
            break;
            case 5: System.out.println("Thurday");
            break;
            case 6: System.out.println("Friday");
            break;
            case 7: System.out.println("Sartuday");
            break;
            case 8: System.out.println("Sunday");
            default: System.out.println("Nhap sai!");
        }
    }
}
