package LEC4;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so diem: ");
        double a = s.nextDouble();
        if (a >= 9 && a <= 10) {
            System.out.println("Excellent");
        } else if (a >= 8 & a < 9) {
            System.out.println("Good");
        } else if (a >= 6.5 && a < 8) {
            System.out.println("Fair");
        } else if (a >= 5 && a < 6.5) {
            System.out.println("Average");
        } else if (a < 5) {
            System.out.println("Fail");
        } else {
            System.out.println("So diem khong hop le!");
        }
    }
}
