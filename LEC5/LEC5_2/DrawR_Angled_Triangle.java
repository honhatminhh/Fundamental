package LEC5_2;
import java.util.*;
public class DrawR_Angled_Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap chieu cao: ");
        int h = s.nextInt();
        for (int i =1;i<=h;i++)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
