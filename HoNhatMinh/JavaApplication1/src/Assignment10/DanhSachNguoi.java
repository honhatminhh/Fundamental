package Assignment10;
import java.util.*;
import java.lang.Exception;
public class DanhSachNguoi {
    ArrayList<Nguoi> dsNguoi = new ArrayList<Nguoi>();
    public void themDanhSach(Nguoi nguoi)
    {
        nguoi.nhapThongTin();
        dsNguoi.add(nguoi);
        System.out.println("Da them!");
    }
   public void capNhatNguoiBangCmnd(int cmnd)
   {
       
   }
   public void xoaDanhSachBangCmnd(int cmnd)
   {
       
   }
   public void xuatDanhSach()
   {
       do{
       for(int i = 0;i<dsNguoi.size();i++)
       {
           dsNguoi.get(i).xuatThongTin();
       }
       } while(dsNguoi.size()!=0);
   }
   
}
