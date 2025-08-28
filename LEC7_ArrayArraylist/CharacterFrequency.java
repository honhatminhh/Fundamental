package LEC7_ArrayArraylist;

import java.util.*;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap 1 chuoi ki tu tu a->z: ");
        String n = s.nextLine().toLowerCase();

        int[] dem = new int[26]; // mảng để đếm số lượng từng ký tự

        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if (c >= 'a' && c <= 'z') {
                dem[c - 'a']++; // đếm số lượng từng ký tự
            }
        }

        System.out.println("Dem so luong tung ki tu cua chuoi nhap vao:");
        for (int i = 0; i < 26; i++) {
            if (dem[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + dem[i]);
            }
        }
    }
}