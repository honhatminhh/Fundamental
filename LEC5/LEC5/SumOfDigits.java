package LEC5;
import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap 1 so: ");
        int n = s.nextInt();
        int tong =0;
        while(n>=9){
        tong = tong+n%10;
        n = (n-n%10)/10;
        }
        tong +=n;
        System.out.println("Tong cac chu so la: "+tong);
    }
}
