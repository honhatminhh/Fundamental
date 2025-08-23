package LEC5_2;
import java.util.*;
public class DrawRectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap chieu cao hcn: ");
        int h= s.nextInt();
        System.out.print("Nhap chieu rong hcn: ");
        int rong = s.nextInt();
        for(int i = 1;i<=h;i++)
        {
            for(int k=1;k<=rong;k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
