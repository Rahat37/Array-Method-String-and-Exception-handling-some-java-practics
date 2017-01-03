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
public class nameInputAndOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n,i;
        n=input.nextInt();
        String[] name = new String[n];
        for(i=0;i<n;i++){
            name[i]=input.next();
        }
        System.out.println("The output is");
        for(i=0;i<n;i++){
            System.out.println(name[i]);
        }
    }
    
}
