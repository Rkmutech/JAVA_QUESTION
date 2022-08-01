package qus_15;

import java.util.Scanner;

public class question_15 {
    public static void main(String[] args) {
        coordinate_point();
    }
    public static void coordinate_point()
    {
        int number1 = GetInteger("Enter the Any number");
        
        int number2 = GetInteger("Enter the Any number");
        
        if(number1 > 0 && number2>0)
        {
            System.out.println("First coordinate");
        }
        else if(number1 < 0 && number2>0)
        {
            System.out.println("secod coordinate");
        }
        else if(number2 < 0 && number1<0)
        {
            System.out.println("Thrid coordinate");
        }
        else if(number1>0 && number2<0)
        {
            System.out.println("Fourth coordinate");
        }
    }
    public static int GetInteger(String message)
    {
        printmessage(message);
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();
        return temp;
    }
    public static void printmessage(String message)
    {
        System.out.println(message);
    }

    
}
