package LEC5;
import java.util.*;
public class SoNguyenTo {

    public static boolean laSNT(int a) {
        int dem = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                dem++;
            }
        }
        if (dem != 2) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap 1 so nguyen: ");
        int x = s.nextInt();
        if (laSNT(x) == true) {
            System.out.println(+x + " La so Nguyen To!!");
        } else {
            System.out.println(+x + " Khong la so Nguyen To!!");
        }
    }
}
