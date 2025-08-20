package LEC4;
import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap canh thu 1: ");
        double a =s.nextDouble();
        System.out.print("Nhap canh thu 2: ");
        double b=s.nextDouble();
        System.out.print("Nhap canh thu 3: ");
        double c=s.nextDouble();
        if((a+b)>c || (a+c)>b || (b+c)>a)
        {
            if(a==b && a==c)
            {
                System.out.println("Tam giac deu!");
            } else if(((a==b) && a!=c) || ((a==c) && a!=b) || ((c==b) && b!=c))
            {
                System.out.println("Tam giac can!");
            } else if ((a*a+b*b == c*c) || (a*a+c*c == b*b) || (c*c+b*b == a*a))
            {
                System.out.println("Tam giac vuong!");
            }
            else
            {
                System.out.println("Tam giac thuong!");
            }
        } else
        {
            System.out.println("Tam giac khong hop le!");
        }
    }
}
