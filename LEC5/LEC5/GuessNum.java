package LEC5;

import java.util.*;

public class GuessNum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        int q = rand.nextInt(100) + 1;
        System.out.print("Nhap 1 so(1~100): ");
        int n = s.nextInt();
        while(true){
        if (n == q) {
            System.out.println("Ban da doan trung!!");
            break;
        } else if (n > q) {
            System.out.println("So cua ban lon hon ket qua!!");
            n = s.nextInt();
        } else {
            System.out.println("So cua ban nho hon ket qua!!");
            n = s.nextInt();
        }
        }
    }
}
