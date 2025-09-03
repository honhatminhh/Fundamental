package LEC8_String;

import java.util.*;

public class ex4_AnagramsChecking {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap chuoi thu #1: ");
        String a = s.nextLine().toLowerCase();
        System.out.print("Nhap chuoi thu #2: ");
        String b = s.nextLine().toLowerCase();
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int dem = 0;
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (ch1[i] == ch2[i]) {
                    dem++;
                } else {
                    System.out.println("The two strings are not Anagrams");
                }
                if (dem == a.length()) {
                    System.out.println("The two strings are Anagrams");
                }
            }
        } else {
            System.out.println("The two strings are not Anagrams");
        }
    }
}
