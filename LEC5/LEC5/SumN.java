package LEC5;
import java.util.*;
public class SumN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap do dai chuoi so hang: ");
        int n = s.nextInt();
        int tong=0;
        for (int i=1;i<=n;i++)
        {
            tong +=i;
        }
        if (n!= 1)
        {
            System.out.println("Tong tu 1 den "+n+" la: "+tong);
        } else
            System.out.println("Tong la 1");
    }
            
}
