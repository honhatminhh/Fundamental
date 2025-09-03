package LEC8_String;

import java.util.*;

public class ex3_StringCompression {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap 1 xau ki tu: ");
        String a = s.next();
        int dem = 1;
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == a.charAt(i - 1)) {
                dem++;
            } else {
                System.out.print(a.charAt(i - 1) + Integer.toString(dem));
                dem = 1;
            }
        }
        System.out.print(a.charAt(a.length()-1)+Integer.toString(dem));
    }
}
