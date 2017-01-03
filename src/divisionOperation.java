/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahat
 */
import java.util.*;
public class divisionOperation {

    public static void division(float x,float y){
        float div=x/y;
        System.out.println("The result is: "+div);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        float number_1 = input.nextFloat();
        System.out.println("Enter the secound number");
        float number_2 = input.nextFloat();
        division(number_1,number_2);
    }
    
}
