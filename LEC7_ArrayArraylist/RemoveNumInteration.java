package LEC7_ArrayArraylist;
import java.util.*;
public class RemoveNumInteration {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = s.nextInt();
        ArrayList<Integer> dayso =new ArrayList<Integer>();
        for (int i=0;i<n;i++)
        {
            System.out.print("Nhap phan tu #"+(i+1)+": ");
            int a = s.nextInt();
            dayso.add(a);
        }
        for(int i=dayso.size()-1;i>=0;i--)
        {
            if(dayso.get(i)>50)
            {
                dayso.remove(i);
            }
        }
        System.out.println("Sau khi xoa cac so >50: ");
        for(int x:dayso)
        {
            System.out.print(x+" ");
        }
    }
}
