/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LEC2;

/**
 *
 * @author Ho Nhat Minh
 */
public class ex21 {
    public static void main(String[] args) {
        int x = 1;
        int y = x + ++x - x-- -x++ + x - x--;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
}
