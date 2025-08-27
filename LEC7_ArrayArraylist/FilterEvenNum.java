package LEC7_ArrayArraylist;
import java.util.*;
public class FilterEvenNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> dayso = new ArrayList<Integer>();
        System.out.print("Nhap so luong phan tu: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i =0;i<n;i++)
        {
            System.out.print("Nhap so thu #" +(i+1)+": ");
            int a = s.nextInt();
            arr[i] = a;
        }
        System.out.print("Day vua nhap: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.print("Day so sau khi chon loc cac so chia het cho 2: ");
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                dayso.add(arr[i]);
            }
        }
        for(int i=0;i<dayso.size();i++)
        {
            System.out.print(dayso.get(i)+" ");
        }
    }
}
