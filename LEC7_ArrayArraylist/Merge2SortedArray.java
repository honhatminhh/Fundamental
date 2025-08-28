package LEC7_ArrayArraylist;

import java.util.*;

public class Merge2SortedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap do dai day do thu #1: ");
        int n1 = s.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr1[i] = s.nextInt();
        }

        System.out.print("Nhap do dai day do thu #2: ");
        int n2 = s.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr2[i] = s.nextInt();
        }

        // Sắp xếp hai mảng tăng dần
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Trộn hai mảng lại với nhau
        int[] result = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        while (i < n1) {
            result[k++] = arr1[i++];
        }
        while (j < n2) {
            result[k++] = arr2[j++];
        }

        System.out.println("Mang sau khi tron:");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
