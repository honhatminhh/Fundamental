package LEC7_ArrayArraylist;

import java.util.*;

public class CountOccurences {

    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap gia tri can tim: ");
        int x = s.nextInt();
        System.out.print("Nhap so phan tu: ");
        int n = s.nextInt();
        int dem = 0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Nhap phan tu #"+(i+1)+": ");
            arr[i]= s.nextInt();
        }
        for (int i = 0; i <n; i++) {
            if (arr[i]==x)
            {
                dem++;
            }
        }
        System.out.println("Co "+dem+" lan xuat hien "+x);
    }
}
