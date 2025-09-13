package Assignment10;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
public abstract class Nguoi {
    Scanner s = new Scanner(System.in);
    
    private String hoVaTen;
    private Date ngaySinh;
    private String gioiTinh;
    private int cmnd;
    public Nguoi(){}

    public Nguoi(String hoVaTen, Date ngaySinh, String gioiTinh, int cmnd) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }
    
            
    public void nhapThongTin()
    {
        System.out.print("Nhap ho va ten: ");
        hoVaTen = s.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh = new Date();
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/YYY");
        String strDate = fmt.format(ngaySinh);
        System.out.print("Nhap gioi tinh: ");
        gioiTinh = s.nextLine();
        System.out.print("Nhap cmnd: ");
        cmnd = s.nextInt();
    }
    public void capNhatNguoiBangCmnd(int cmnd)
    {
        System.out.print("Cap nhat cmnd: ");
        cmnd = s.nextInt();
    }
    public void xuatThongTin()
    {
        System.out.println("Ho va ten: "+hoVaTen);
        System.out.println("Ngay sinh: "+ngaySinh);
        System.out.println("Gioi tinh: "+gioiTinh);
        System.out.println("CMND: "+cmnd);
    }
    public abstract void traTienDoXe();
    
    
}
