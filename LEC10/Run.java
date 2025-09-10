package LEC10;

import java.text.ParseException;
import java.util.*;

public class Run {

    public static void main(String[] args) throws ParseException {
        Scanner s = new Scanner(System.in);
        int k = 1;
        do {
            System.out.print("Ban muon nhap thong tin cho ai? 1 - sinh vien, 2 - giao vien: ");
            int n = s.nextInt();

            System.out.println("Nhap thong tin: ");
            switch (n) {
                case 1:
                    Student stu = new Student("", "", "", 0, null);
                    stu.input();
                    stu.output();
                    stu.danhGiaRenLuyen();
                    System.out.println("Tiep tuc? 1-yes, 2-no: ");
                    int a = s.nextInt();
                    if (a == 1) {
                        k = 1;
                    } else {
                        k = 0;
                    }
                    break;
                case 2:
                    Teacher tea = new Teacher("", "", "", 0, null);
                    tea.input();
                    tea.output();
                    tea.xepLoaiThiDua();
                    System.out.println("Tiep tuc? 1-yes, 2-no: ");
                    int aaa = s.nextInt();
                    if (aaa == 1) {
                        k = 1;
                    } else {
                        k = 0;
                    }
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }

        } while (k == 1);

    }
}
