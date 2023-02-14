/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nicolas S2184072/1
 */
public class L6Q2 {
    public static void multiPrint(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
    public static void main(String[] args) {
        int row = 5;
        //Triangle
        for (int i = 0; i < row; i++) {
            multiPrint(row - i, ' ');
            multiPrint(i * 2 + 1, '*');
            System.out.println("");
        }

        System.out.println("");

        //Diamond
        for (int i = 0; i <= row; i++) {
            multiPrint(row - i, ' ');
            multiPrint(i * 2 + 1, '*');
            System.out.println("");
        }

        for (int i = row - 1; i >= 0; i--) {
            multiPrint(row - i, ' ');
            multiPrint(i * 2 + 1, '*');
            System.out.println("");
        }
    }

}

