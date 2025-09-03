package LEC8_String;
import java.util.*;
public class ex6_FindLongestWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap 1 chuoi ki tu: ");
        String a = s.nextLine();
        String[] word = a.split(" ");
        String kq = word[0];
        for(int i =0;i<word.length;i++)
        {
            if(word[i].length()>kq.length())
            {
                kq = word[i];
            }
            
        }
        System.out.println(kq);
    }
}
