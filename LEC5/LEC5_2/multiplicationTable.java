package LEC5_2;
import java.util.*;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap 1 so(tu 2 den 9): ");
        int n = s.nextInt();
        for (int i=1;i<=n;i++)
        {
            System.out.println(+n +" x " +i +" = " +(n*i));
        }
    }
    
}
