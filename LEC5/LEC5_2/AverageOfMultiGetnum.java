package LEC5_2;

import java.util.*;

public class AverageOfMultiGetnum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double tong = 0;
        double dem = 0;
        while(true)
        {
            
            System.out.print("Nhap 1 gia tri (0 de dung lai): ");
            double n = s.nextDouble();
            tong+=n;
            dem++;
            if(n==0)
            {
                break;
            }
        }
        //System.out.println(dem);
        System.out.println("Trung binh cong: " +(tong/(dem-1)));

    }
}
