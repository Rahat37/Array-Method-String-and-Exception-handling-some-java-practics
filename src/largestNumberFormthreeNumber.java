
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahat
 */
public class largestNumberFormthreeNumber {
    public static void large(){
    
         Scanner input=new Scanner(System.in);
        int i,n,number;
        System.out.println("Enter the size if the number");
        n=input.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        number=arr.length;
        number = number -1;
        System.out.println(arr[number]);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       large();
    }
    
}
