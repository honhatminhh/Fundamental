package LEC7_ArrayArraylist;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap n phan tu: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];
        for(int i =0;i<n;i++)
        {
            System.out.print("Nhap phan tu thu #"+(i+1)+": ");
            arr[i] = s.nextInt();
        }
        int dem = n;
        for(int i = 0;i<n;i++)
        {
            arr1[i]=arr[dem-1];
            dem--;
        }
        System.out.println("Sau khi dao nguoc: ");
        for (int i =0;i<n;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}
