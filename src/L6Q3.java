
import java.util.Arrays;
import java.util.Collections;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nicolas S2184072/1
 */
public class L6Q3 {
    static void reverse(Integer myArray[]) { 
        Collections.reverse(Arrays.asList(myArray)); 
        System.out.println("Reversed Array:" + Arrays.asList(myArray)); 
    } 
    public static void main(String[] args) { 
        Integer [] myArray = {1,2,3,4,5,6,7,8,9,10}; 
        System.out.println("Original Array:" + Arrays.asList(myArray));
        reverse(myArray); 
    } 
}

 


