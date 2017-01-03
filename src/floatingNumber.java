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
public class floatingNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array");
        n=input.nextInt();
        float arr[]=new float[n];
        for (int i=0;i<n;i++){
            arr[i]=input.nextFloat();
        }
        System.out.println("Output is");
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }

        
        
    }
    
}
