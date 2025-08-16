
package LEC4;
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so thuc thu 1: ");
        float a1 = s.nextFloat();
        System.out.print("Nhap so thuc thu 2: ");
        float a2 = s.nextFloat();
        System.out.println("Trung binh cong 2 so vua nhap la: " +(a1+a2)/2);
    }
    
}
