package LEC10;

import java.util.*;
import java.util.Date;
import java.lang.*;
import java.text.*;
import java.time.Instant;
public class Person {
Scanner s = new Scanner(System.in);
    String name;
    String gTinh;
    int cmnd;
    Date date;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        //String strDate; 

    public Person(String name, String gTinh, int cmnd, Date date) {
        this.name = name;
        this.gTinh = gTinh;
        this.cmnd = cmnd;
        this.date = date;
    }
    
    //Date date = new Date();

    void input() throws ParseException {
        System.out.print("Nhap ten: ");
        name = s.nextLine();
        System.out.print("Nhap ngay sinh: ");
        date = formatter.parse(s.nextLine());
        
        System.out.print("Nhap gioi tinh: ");
        gTinh = s.nextLine();
        System.out.print("Nhap CMND: ");
        cmnd = s.nextInt();

    }

    void output() {
        System.out.println("Ho va ten: "+name);
        System.out.println("Gioi tinh: "+gTinh);
        System.out.println("Ngay sinh: "+formatter.format(date));
        System.out.println("CMND: "+cmnd);
    }
}
