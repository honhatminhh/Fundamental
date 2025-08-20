package LEC4;
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so nguyen thu 1: ");
        int a = s.nextInt();
        System.out.print("Nhap so nguyen thu 2: ");
        int b = s.nextInt();
        System.out.print("Nhap toan tu can dung (1: +, 2: -, 3: *, 4: /): ");
        int c = s.nextInt();
        if(c==1)
        {
            System.out.println("Ket qua la " +(a+b));
        } else if (c==2)
        {
            System.out.println("Ket qua la " +(a-b));
        } else if (c==3)
        {
            System.out.println("Ket qua la "+(a*b));
        } else if(c==4 && b !=0)
        {
            System.out.println("Ket qua la "+(a/b));
        } else
        {
            System.out.println("Nhap sai!");
        }
    }
}
