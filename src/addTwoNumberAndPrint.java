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
public class addTwoNumberAndPrint {

    /**
     * @param args the command line arguments
     */
    public static int sum(int x,int y){
        int add=0;
        add = x+y;
        return add;
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        int number_1,number_2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number");
        number_1=input.nextInt();
        System.out.println("Enter 2st number");
        number_2=input.nextInt();
        int addNumber = sum(number_1,number_2);
        System.out.println("The sum is : "+addNumber);
    }
    
}
