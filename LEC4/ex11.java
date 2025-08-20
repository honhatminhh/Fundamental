package LEC4;
import java.util.*;
public class ex11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        double a =s.nextDouble();
        System.out.print("Nhap he so b: ");
        double b =s.nextDouble();
        System.out.print("Nhap he so c: ");
        double c =s.nextDouble();
        double delta = b*b - 4*a*c;
        if(delta<0)
        {
            System.out.println("Phuong trinh vo nghiem!");
        } else if(delta==0)
        {
            double kq = -b/(2*a);
            System.out.println("Phuong trinh co nghiem kep! x1 = x2 = "+kq);
        } else
        {
            double n1 = (-b +Math.sqrt(delta))/(2*a);
            double n2 = (-b -Math.sqrt(delta))/(2*a);
            System.out.println("Phuong trinh co 2 nghiem!");
            System.out.println("x1 = "+n1);
            System.out.println("x2 = "+n2);
        }
    }
}
