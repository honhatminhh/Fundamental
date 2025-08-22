package LEC5;
import java.util.*;
public class Rand_Dice {
    public static void main(String[] args) {
        
        Random random = new Random();
        int tries = 0;
        int d1 ;
        int d2 ;
        do{
            d1 = random.nextInt(6)+1;
            d2 = random.nextInt(6)+1;
            System.out.println("Roll "+(tries+1)+": "+d1 + " + "+d2);
            tries ++;
            
        } while(d1 != d2);
        System.out.println("You rolled doubles after " +tries +" times!!");
    }
}
