package LEC8_String;
import java.util.*;
public class ex10_FindLongestCommonSubstring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap chuoi thu nhat: ");
        String str1 = s.nextLine();
        System.out.print("Nhap chuoi thu hai: ");
        String str2 = s.nextLine();
        String longestCommonSubstring = findSubstring(str1, str2);
        System.out.println("Chuoi con chung dai nhat: " + longestCommonSubstring);
    }
    public static String findSubstring(String str1, String str2) {
        String longest = "";
        for(int i=0;i<str1.length();i++)
        {
            for(int j = i+1;j<=str1.length();j++)
            {
                String a = str1.substring(i,j);
                if(str2.contains(a) && a.length()>longest.length())
                {
                    longest = a;
                }
            }
        }
        return longest;
    }
}