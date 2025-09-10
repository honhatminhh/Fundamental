package LEC10;

import java.util.Date;
import java.util.*;

public class Teacher extends Person {

    Scanner s = new Scanner(System.in);
    String maGV;

    public Teacher(String maGV, String name, String gTinh, int cmnd, Date date) {
        super(name, gTinh, cmnd, date);
        this.maGV = maGV;
    }

    void xepLoaiThiDua() {
        System.out.print("Chon loai thi dua 1-loai A, 2-loai B, 3-loai C: ");
        int n = s.nextInt();
        System.out.print("Thi dua loai ");
        switch (n) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            default:
                break;
        }
    }
}
