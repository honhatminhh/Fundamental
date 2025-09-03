package LEC8_String;
import java.util.*;
public class ex7_CreateAnAcronym {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap 1 chuoi ki tu: ");
        String a = s.nextLine();
        String[] word = a.split(" ");
        String kq;
        for(int i =0;i<word.length;i++)
        {
            kq=word[i];
            System.out.print(kq.charAt(0));
        }
        System.out.println("");
    }
}
