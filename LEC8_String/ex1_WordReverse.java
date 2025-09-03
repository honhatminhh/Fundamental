package LEC8_String;
import java.util.*;
public class ex1_WordReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap 1 chuoi ki tu: ");
        String a = s.nextLine();
        String[] word = a.split(" ");
        for(int i = word.length - 1;i>=0;i--)
        {
            System.out.print(word[i]+ " ");
        }
    }
}
