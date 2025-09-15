package Assignment10;

import java.text.SimpleDateFormat;
import java.util.*;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        DanhSachNguoi dsNguoi = new DanhSachNguoi();
        int c;
        do {
            System.out.println("Chon chuc nang:");
            System.out.println("0: Thoat chuong trinh");
            System.out.println("1: Nhap thong tin");
            System.out.println("2: Sua danh sach");
            System.out.println("3: Xoa danh sach");
            System.out.println("4: Xuat danh sach");
            System.out.print("Chon chuc nang: ");
            c = Integer.parseInt(sc.nextLine());
            switch(c){
                case 0: break;
                case 1: System.out.print("Ban muon nhap thong tin cho ai? 1-Sinh vien, 2-Giao vien: ");
                int chon = Integer.parseInt(sc.nextLine());
                switch(chon){
                    case 1: SinhVien stu = new SinhVien();
                    dsNguoi.themDanhSach(stu, sc, sdf);
                    break;
                    case 2: GiaoVien gv = new GiaoVien();
                    dsNguoi.themDanhSach(gv, sc, sdf);
                    default: System.out.println("Lua chon khong hop le!");
                    break;
                }
                break;
                case 2: dsNguoi.suaThongTin(sc);
                break;
                case 3: dsNguoi.xoaThongTin(sc);
                break;
                case 4: dsNguoi.xuatDanhSach();
                break;
                default: System.out.println("Lua chon khong hop le!");
                
            }
        } while (c!=0); 
        System.out.println("Thoat chuong trinh!");
    }
}
