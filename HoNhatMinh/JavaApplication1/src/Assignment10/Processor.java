package Assignment10;
import java.util.*;
public class Processor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DanhSachNguoi dsNguoi = new DanhSachNguoi(); 
        int c;
        System.out.println("Chon chuc nang:");
        System.out.println("1: Nhap thong tin");
        System.out.println("2: Sua danh sach");
        System.out.println("3: Xoa danh sach");
        System.out.println("4: Xuat danh sach");
        c = s.nextInt();
        if (c==1)
        {
            int d;
            System.out.print("Ban muon nhap cho ai(1-Sinh vien, 2-Giao vien): ");
            d = s.nextInt();
            if(d==1)
            {
                SinhVien sinhVien = new SinhVien();
                dsNguoi.themDanhSach(sinhVien);
            } else if(d==2)
            {
                GiaoVien giaoVien = new GiaoVien();
                dsNguoi.themDanhSach(giaoVien);
            } else
            {
                System.out.println("Nhap sai!");
            }
        } else if (c==4)
        {
            System.out.println("Danh sach tat ca moi nguoi:");
            dsNguoi.xuatDanhSach();
        } else if (c==3)
        {
            
        } else if (c==2)
        {
            
        } else
        {
            System.out.println("Nhap sai");
        }
    }
}
