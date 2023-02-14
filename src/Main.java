/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Nicolas S2184072/1
 */
public class Main {
    public static int max(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
       
    }
    public static void main(String[] args) {
        int num1, num2, num3;
        System.out.println("The maximum number from given 3 number is : " + max(123,23,3));
    }
    
}
