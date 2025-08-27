package LEC7_ArrayArraylist;

import java.util.*;

public class UnlimitedDataEntry {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> dayso = new ArrayList<Integer>();
        int tong = 0;
        while (true) {

            System.out.print("Nhap 1 phan tu(nhap -1 de thoat): ");
            int n = s.nextInt();
            if (n == -1) {
                break;
            } else {
                dayso.add(n);
                tong = tong + n;
            }
        }
        System.out.print("Cac so vua nhap: ");
        for (int i = 0; i < dayso.size(); i++) {
            System.out.print(dayso.get(i) + " ");
        }
        System.out.println("");
        System.out.println("Tong cac phan tu = " + tong);
    }
}
