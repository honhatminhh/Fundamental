package LEC8_String;
import java.util.*;
public class ex9_Format1NumberString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap 1 chuoi so: ");
        StringBuilder a = new StringBuilder(s.nextLine());
        int dem = 0;
        for (int i = a.length() - 1; i > 0; i--) {
            dem++;
            if (dem % 3 == 0) {
                a.insert(i, ",");
            }
        }
        System.out.println(a);
    }
}