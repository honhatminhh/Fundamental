package LEC5;
import java.util.*;
public class CalFactorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong: ");
        int n = s.nextInt();
        int tong=1;
        for(int i =1;i<=n;i++)
        {
            tong = tong * i;
        }
        System.out.println("Gia tri cua "+n+"! = "+tong);
    }
}
