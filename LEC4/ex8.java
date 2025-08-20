package LEC4;
import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap hoanh do x: ");
        double x = s.nextDouble();
        System.out.print("Nhap tung do y: ");
        double y = s.nextDouble();
        if(x>0&&y>0)
        {
            System.out.println("Diem thuoc goc phan tu I");
        } else if (x<0&&y>0)
        {
            System.out.println("Diem thuoc goc phan tu II");
        } else if (x<0&&y<0)
        {
            System.out.println("Diem thuoc goc phan tu III");
        } else if(x>0&&y<0)
        {
            System.out.println("Diem thuoc goc phan tu IV");
        } else
        {
            System.out.println("Diem trung voi goc toa do!");
        }
    }
}
