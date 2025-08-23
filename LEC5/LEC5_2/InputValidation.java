package LEC5_2;
import java.util.*;
public class InputValidation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap 1 so (1~10): ");
        int n = s.nextInt();
        do{
            System.out.println("Nhap sai!! Vui long nhap lai: ");
            n = s.nextInt();
        }while(n<1 || n>10);
        System.out.println("Ban da nhap so "+n);
    }
}
