package LEC7_ArrayArraylist;

import java.util.*;

public class SecondLargestNum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = s.nextInt();
        int dayso[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu #" + (i + 1) + ": ");
            int a = s.nextInt();
            dayso[i] = a;
        }

        int max = dayso[0];
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (dayso[i] > max) {
                secondMax = max;
                max = dayso[i];
            } else if (dayso[i] > secondMax && dayso[i] != max) {
                secondMax = dayso[i];
            }
        }

        System.out.println("So lon thu hai: " + secondMax);
    }
}
