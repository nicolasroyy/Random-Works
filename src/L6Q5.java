
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nicolas S2184072/1
 */
public class L6Q5 {
    public static boolean isProductOf(int num1, int num2, int num3) {
        return num1 * num2 == num3;
    }
    
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        while (true) {
            System.out.println("Enter a negative number to quit.");
            //Random number from 0-12
            int num1 = random.nextInt(13);
            int num2 = random.nextInt(13);

            System.out.printf("%d x %d = ", num1, num2);

            int input = scanner.nextInt();

            if (input < 0) {
                break;
            }
            if (isProductOf(num1, num2, input)) {
                score++;
            }
        }
        System.out.println("Your Score is " + score);
    }

}
