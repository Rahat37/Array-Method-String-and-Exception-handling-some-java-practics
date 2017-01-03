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

public class inputNamePrintUsingMethod {
    public static void nameFunction(String name,String name_one,String name_two){
        System.out.println("The first name is "+name+". The secound name is "+name_one+". The third name is "+name_two);
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first name");
        String name=input.next();
        System.out.println("Enter the secound name");
        String name_one=input.next();
        System.out.println("Enter the thrird name");
        String name_two=input.next();
        nameFunction(name,name_one,name_two);
    }
    
}
