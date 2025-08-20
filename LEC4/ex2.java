package LEC4;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so tuoi: ");
        int a = s.nextInt();
        if (a>0 && a<13)
        {
            System.out.println("Child!");
        }
        else if(a>12 && a<20)
        {
            System.out.println("Teenager!");
        }
        else if (a>19 && a <60)
        {
            System.out.println("Adult!");
        }
        else if (a>=60)
        {
            System.out.println("Senior!");
        }
        else
        {
            System.out.println("So tuoi khong hop le!");
        }
    }
}
