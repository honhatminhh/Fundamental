package LEC7_ArrayArraylist;

import java.util.*;

public class SwapInArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = s.nextInt();
        int dayso[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Nhap phan tu thu #"+(i+1)+": ");
            int x =s.nextInt();
            dayso[i]=x;
        }
        int a = 0, b = 0;
        do {
            System.out.print("Nhap vi tri phan tu #1 de hoan doi: ");
            a = s.nextInt();
            System.out.print("Nhap vi tri phan tu #2 de hoan doi: ");
            b = s.nextInt();
        } while (!((a >= 0 && a < n) && (b >= 0 && b < n)));
        for (int i = 0; i < n; i++) {
            int temp=dayso[a];
            dayso[a]=dayso[b];
            dayso[b]=temp;
        }
        System.out.println("");
        System.out.print("Sau khi hoan doi: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(dayso[i]+" ");
        }
        
    }
}
