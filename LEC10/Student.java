package LEC10;
import java.util.Date;
import java.util.*;
public class Student extends Person {
    Scanner sc = new Scanner(System.in);
    String maSV;

    public Student(String maSV, String name, String gTinh, int cmnd, Date date) {
        super(name, gTinh, cmnd, date);
        this.maSV = maSV;
    }   
    
    void danhGiaRenLuyen()
    {
        System.out.print("Chon 1-gioi, 2-kha, 3-trung binh, 4-yeu: ");
        int n = sc.nextInt();
        System.out.print("xep loai ");
        switch(n){
            case 1: System.out.println("gioi");
            break;
            case 2: System.out.println("kha");
            break;
            case 3: System.out.println("trung binh");
            break;
            case 4: System.out.println("kha");
            break;
            default: break;
        }
    }
}
