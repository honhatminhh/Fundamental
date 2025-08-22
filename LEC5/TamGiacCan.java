package LEC5;
import java.util.*;
public class TamGiacCan {

    public static void main(String[] args) {
        System.out.print("Nhap chieu cao: ");
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int kcNgoai = h - 1;
        int day = (h - 1) * 2 + 1;
        int khucGiua = h - 2;
        int kcTrong = 1;
        for (int i = 1; i <= kcNgoai; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        if (khucGiua >= 1) {
            
            for (int i = 1; i <= khucGiua; i++) {//chay so lan in khuc giua
                kcNgoai--;
                for(int k =1;k<=kcNgoai;k++){
                System.out.print(" ");
                }
                System.out.print("*");
                for(int k =1;k<=kcTrong;k++){
                System.out.print(" ");
                }
                System.out.print("*");
                for(int k =1;k<=kcNgoai;k++){
                System.out.print(" ");
                }
                System.out.print("\n");
                kcTrong +=2;
            }
        }
        for (int i = 1; i <= day; i++) {
            System.out.print("*");
        }
    }
}
