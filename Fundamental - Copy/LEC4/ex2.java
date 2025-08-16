
package LEC4;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        String ten = s.next();
        System.out.print("Nhap tuoi: ");
        int tuoi = s.nextInt();
        System.out.println("Hello "+ten+", you're "+tuoi+" years old!");
    }
}
