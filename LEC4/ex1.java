package LEC4;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so nguyen: ");
        int a = s.nextInt();
        if (a % 2 == 0) {
            System.out.println("So " + a + " la so chan!");
        } else {
            System.out.println("So " + a + " la so le!");
        }
    }
}
