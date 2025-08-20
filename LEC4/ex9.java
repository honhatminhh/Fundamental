package LEC4;
import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap 1 so: ");
        double a = s.nextDouble();
        
        if (a>0)
        {
            System.out.println("Gia tri tuyet doi la: "+a);
        }
        else if(a<0)
        {
            System.out.println("Gia tri tuyet doi la: "+(a*(-1.0)));
        } else
            System.out.println("Gia tri tuyet doi la: 0");
}
}
