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
public class sumAndAvarage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i,sum=0,avrg=0,n;
        System.out.println("Enter the size if the number");
        n=input.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(i=0;i<arr.length;i++)
        {
            sum=arr[i]+sum;
        }
        System.out.println("The sum is: "+sum);
        avrg=sum/5;
        System.out.println("The avarage is: "+avrg);
    }
    
}
