package LEC8_String;
import java.util.*;
public class ex8_CountWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap 1 chuoi ki tu: ");
        String a = s.nextLine();
        String[] word = a.split("\\s+");
        System.out.println("The number of words in the string is: " + word.length);
    }
}
