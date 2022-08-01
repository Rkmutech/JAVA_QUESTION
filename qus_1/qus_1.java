package qus_1;

import java.util.Scanner;

public class qus_1 {
     public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("Enter the Any number:");
        int num=number.nextInt();
        if(num>0)
        {
           System.out.println(num+" Number is positive ");
        }else if(num<0)
        {
            System.out.println(num+"Number is negative");
        }else 
        {
            System.out.println(num+"Number is 0");
        }

        
    }
    
}
