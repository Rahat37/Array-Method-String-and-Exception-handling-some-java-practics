/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.method.exception;
import java.util.*;
/**
 *
 * @author Rahat
 */
public class positiveAndNagetiveNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=input.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.println(arr[i]+"The number is nagetive");
            }
            else if(arr[i]>0){
                System.out.println(arr[i]+"The number is positive");
            }
            else{
                System.out.println(arr[i]+"The number is zero");
            }
        
        }
    }
    
}
