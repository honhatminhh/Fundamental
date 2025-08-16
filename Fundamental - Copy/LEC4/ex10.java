
package LEC4;
import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useDelimiter("##|\\n");
        System.out.println("Nhap cac tu duoc cach nhau boi dau ##: ");
        while(s.hasNext())
        {
            System.out.println(s.next());
        }
        s.close();
    }
    
}
