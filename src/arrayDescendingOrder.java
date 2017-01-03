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
import java.util.Arrays;
import java.util.Collections;

public class arrayDescendingOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Please enter the size of array");
        n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        
        int k=arr.length - 1;
        for(int j=k;j>=0;j--){
            System.out.println(arr[j]);
        }
    }
    
}
