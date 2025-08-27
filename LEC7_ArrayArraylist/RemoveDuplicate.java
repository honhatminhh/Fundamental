package LEC7_ArrayArraylist;

import java.util.*;

public class RemoveDuplicate {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        ArrayList<Integer> daynhap = new ArrayList<Integer>();
        ArrayList<Integer> dayxuat = new ArrayList<Integer>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu #" + (i + 1) + ": ");
            int a = s.nextInt();
            daynhap.add(a);
        }
        System.out.println("Day vua nhap: ");
        for (int i = 0; i < n; i++) {
            System.out.print(daynhap.get(i) + " ");
        }
        for (int i = 0; i < n; i++) {
            if (!dayxuat.contains(daynhap.get(i))) {
                dayxuat.add(daynhap.get(i));
            }
        }
        System.out.println("");
        System.out.print("Day sau khi xoa: ");
        for (int i = 0; i < dayxuat.size(); i++) {
            System.out.print(dayxuat.get(i) + " ");
        }
    }
}
