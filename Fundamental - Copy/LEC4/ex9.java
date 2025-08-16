
package LEC4;
import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        int num = s.nextInt();
        s.nextLine();
        System.out.print("Nhap 1 cau: ");
        String sen = s.nextLine();
        System.out.println("+So nguyen: "+num);
        System.out.println("+Cau van: "+sen);
    }
    
}
