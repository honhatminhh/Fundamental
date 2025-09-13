package Assignment10;

import java.util.Date;

import java.util.*;

public class SinhVien extends Nguoi {

    private String maSinhVien;
    private String renLuyen;

    public SinhVien(String maSinhVien, String renLuyen, String hoVaTen, Date ngaySinh, String gioiTinh, int cmnd) {
        super(hoVaTen, ngaySinh, gioiTinh, cmnd);
        this.maSinhVien = maSinhVien;
        this.renLuyen = renLuyen;
    }

    public SinhVien() {
    }
    

    public void danhGiaRenLuyen() {
        int a;
        System.out.print("Lua hon ren luyen (1-Gioi, 2-Kha, 3-Trung binh, 4-Yeu): ");
        a = s.nextInt();
        switch(a){
            case 1: renLuyen = "Gioi";
            break;
            case 2: renLuyen = "Kha";
            break;
            case 3: renLuyen = "Trung binh";
            break;
            case 4: renLuyen = "Yeu";
            break;
            default: System.out.print("Lua chon loi!");
            break;
        }
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhap ma sinh vien: ");
        maSinhVien = s.nextLine();
        danhGiaRenLuyen();
    }
    @Override
    public void capNhatNguoiBangCmnd(int cmnd){
        super.capNhatNguoiBangCmnd(cmnd);
    }
    @Override
    public void xuatThongTin(){
        super.xuatThongTin();
        System.out.println("Ma sinh vien: "+maSinhVien);
        System.out.print("Danh gia ren luyen: "+renLuyen);
    }
    @Override
    public void traTienDoXe(){ 
        System.out.println("Sinh vien: 2000d/ luot");
    }
    
}
