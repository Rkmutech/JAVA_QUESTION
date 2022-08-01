package qus_8;

import java.util.Scanner;

public class question_8 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number1:");
        int number1=obj.nextInt();
        System.out.println("Enter the number2:");
        int number2=obj.nextInt();
        System.out.println("Enter the number3:");
        int number3=obj.nextInt();
       
        if(number1>number2)
        {
            System.out.println("Number1 is Big ");
        }
        else if (number2>number3)
        {
            System.out.println("Number2 is Big ");
        }
        else 
        {
            System.out.println("Number3 is Big ");
        }
    }
}
