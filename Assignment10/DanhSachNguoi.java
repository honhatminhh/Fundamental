package Assignment10;

import java.util.*;
import java.lang.Exception;
import java.text.*;

public class DanhSachNguoi {

    ArrayList<Nguoi> dsNguoi = new ArrayList<Nguoi>();

    public void themDanhSach(Nguoi nguoi, Scanner sc, SimpleDateFormat sdf) {
        nguoi.nhapThongTin(sc, sdf);
        dsNguoi.add(nguoi);
        System.out.println("Da them!");
    }

    public void suaThongTin(Scanner s) {
        int ID, index = -1;
        System.out.print("Nhap so CMND de xoa: ");
        ID = Integer.parseInt(s.nextLine());
        for (int i = 0; i < dsNguoi.size(); i++) {
            if (ID == dsNguoi.get(i).getCmnd()) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.print("Nhap so CMND moi: ");
            int newID = Integer.parseInt(s.nextLine());
            dsNguoi.get(index).setCmnd(newID);
            System.out.println("Da cap nhat so CMND: " + newID);
        } else {
            System.out.println("Khong tim thay so CMND!");
        }
    }

    public void xoaThongTin(Scanner s) {
        int ID, index = -1;
        System.out.print("Nhap so CMND de xoa: ");
        ID = Integer.parseInt(s.nextLine());
        for (int i = 0; i < dsNguoi.size(); i++) {
            if (ID == dsNguoi.get(i).getCmnd()) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            dsNguoi.remove(index);
            System.out.println("Da xoa cmnd: " + ID);

        } else {
            System.out.println("Khong tim thay so CMND!");
        }

    }

    public void xuatDanhSach() {
        for (Nguoi nguoi : dsNguoi) {
            nguoi.xuatThongTin();
        }
    }

}
