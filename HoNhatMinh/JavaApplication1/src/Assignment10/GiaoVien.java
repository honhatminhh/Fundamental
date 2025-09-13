package Assignment10;

import java.util.*;

public class GiaoVien extends Nguoi {

    private String maGiaoVien;
    private String xepLoaiThiDua;

    public GiaoVien(String maGiaoVien, String xepLoaiThiDua, String hoVaTen, Date ngaySinh, String gioiTinh, int cmnd) {
        super(hoVaTen, ngaySinh, gioiTinh, cmnd);
        this.maGiaoVien = maGiaoVien;
        this.xepLoaiThiDua = xepLoaiThiDua;
    }

    public GiaoVien() {
    }

    public String getMaGiaoVien() {
        return maGiaoVien;
    }

    public void setMaGiaoVien(String maGiaoVien) {
        this.maGiaoVien = maGiaoVien;
    }

    public String getXepLoaiThiDua() {
        return xepLoaiThiDua;
    }

    public void setXepLoaiThiDua(String xepLoaiThiDua) {
        this.xepLoaiThiDua = xepLoaiThiDua;
    }

    public void xepLoaiThiDua() {
        int b;
        System.out.print("Chon loai thi dua(1-loai A, 2-loai B, 3-loai C): ");
        b= s.nextInt();
        switch(b)
        {
            case 1: xepLoaiThiDua = "loai A";
            break;
            case 2: xepLoaiThiDua = "loai B";
            break;
            case 3: xepLoaiThiDua = "loai C";
            break;
            default: break;
        }
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhap ma giao vien: ");
        maGiaoVien = s.nextLine();
        xepLoaiThiDua();
    }

    @Override
    public void capNhatNguoiBangCmnd(int cmnd) {
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Ma giao vien: "+maGiaoVien);
        System.out.println("Loai thi dua: "+xepLoaiThiDua);
    }

    @Override
    public void traTienDoXe() {
        System.out.println("Giao vien: mien phi");
    }
    
}
