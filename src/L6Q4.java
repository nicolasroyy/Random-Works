/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nicolas S2184072/1
 */
public class L6Q4 {
    public static int gcd(int i, int j) {
        while (j > 0) {
            int r = i % j;
            i = j;
            j = r;
        }
        return i;
    }

    public static int gcdWithRecursion(int i, int j) {
        if (j == 0) {
            return i;
        }
        int r = i % j;
        return gcdWithRecursion(j, r);
    }
        
    public static void main(String[] args) {
        System.out.println("GCD Iteratively");
        System.out.println(gcd(24, 8));
        System.out.println(gcd(200, 625));

        System.out.println("");

        System.out.println("GCD Recursively");
        System.out.println(gcdWithRecursion(24, 8));
        System.out.println(gcdWithRecursion(200, 625));
    }
}

