package LEC7_ArrayArraylist;

import java.util.*;

public class FindMinMax {

    public static void main(String[] args) {
        System.out.print("Nhap n phan tu: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu #" + (i + 1) + ": ");
            arr[i] = s.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("GTLN: " + max);
        System.out.println("GTNN: " + min);
    }
}
