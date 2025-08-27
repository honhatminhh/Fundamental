package LEC7_ArrayArraylist;
import java.util.*;
public class SortAndSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> dayso = new ArrayList<Integer>();
        for(int i=0;i<5;i++)
        {
            System.out.print("Nhap so thu "+(i+1)+": ");
            int n = s.nextInt();
            dayso.add(n);
            dayso.sort(null);
        }
        
        System.out.print("Day sau khi sap xep: ");
        for (int i=0;i<5;i++)
        {
            System.out.print(dayso.get(i)+" ");
        }
        System.out.println("");
        System.out.print("Nhap phan tu can tim: ");
        int x = s.nextInt();
        for(int i=0;i<5;i++)
        {
            //int index=0;
            if(x==dayso.get(i))
            {
                
                System.out.println("So "+x+" duoc tim thay o vi tri thu " +i);
            } 
            
        }
    }
}
