package LEC4;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap so nam: ");
        int a = s.nextInt();
        if (a % 4 == 0 && a % 100 != 0) {
            System.out.println("Nam " + a + " la nam nhuan!");
        } else {
            System.out.println("Nam " + a + " khong la nam nhuan!");
        }
    }
}
