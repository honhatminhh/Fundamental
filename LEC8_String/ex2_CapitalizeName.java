package LEC8_String;

import java.util.*;

public class ex2_CapitalizeName {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String a = s.nextLine().trim().toLowerCase();
        String[] word = a.split("\\s+");
        for (int i = 0; i < word.length; i++) {
            System.out.print(word[i].substring(0, 1).toUpperCase() + word[i].substring(1).toLowerCase() + " ");
        }
    }
}
