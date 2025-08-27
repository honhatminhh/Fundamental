package LEC7_ArrayArraylist;

import java.util.*;

public class Connect2Arrays {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap do dai day thu #1: ");
        int n1 = s.nextInt();
        int day1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.print("Nhap phan tu thu #" + (i + 1) + ": ");
            int x1 = s.nextInt();
            day1[i] = x1;
        }
        System.out.print("Nhap do dai day thu #2: ");
        int n2 = s.nextInt();
        int day2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            System.out.print("Nhap phan tu thu #" + (i + 1) + ": ");
            int x2 = s.nextInt();
            day2[i] = x2;
        }
        int n3 = n1 + n2;
        int dem =0;
        int day3[] = new int[n3];
        for (int i = 0; i < n1; i++) {
            day3[i] = day1[i];
        }
        for (int i = n1; i < n3; i++) {
            
            day3[i] = day2[dem];
            dem++;
        }
        System.out.println("Sau khi noi 2 day: ");
        for (int i = 0; i < n3; i++) {
            System.out.print(day3[i] + " ");
        }
    }
}
