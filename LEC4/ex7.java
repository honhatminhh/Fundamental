package LEC4;

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so nguyen thu 1: ");
        int a = s.nextInt();
        System.out.print("Nhap so nguyen thu 2: ");
        int b = s.nextInt();
        System.out.print("Nhap so nguyen thu 3: ");
        int c = s.nextInt();
        int max = a;
        if (max > b && max > c) {
            System.out.println("So lon nhat la: " + max);
        } else if (max>b && max<c) {
            System.out.println("So lon nhat la: "+c);
        } else if (max>c && max<b) {
            System.out.println("So lon nhat la: "+b);
    } else if(b>c)
    {
        System.out.println("So lon nhat la: "+b);
    } else 
    {
        System.out.println("So lon nhat la: "+c);
    }
}
}
