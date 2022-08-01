package qus_9;

import java.util.Scanner;

public class question_9 {
    public static void smallest_ofthree_numbers()
    {
        int number1 = GetInteger("Enter the numbers: ");
       
        int number2 = GetInteger("Enter the numbers: ");
        
        int number3 = GetInteger("Enter the numbers: ");
       
        if (number1 < number2)
        {
            System.out.println(number1 + ":Number1 is Small");

        }
        else if (number2 < number3)
        {
            System.out.println(number2 + ":Number2 is Small");
        }
        else if (number3 < number1)
        {
            System.out.println(number3 + "Number3 is Small");
        }
    }
    public static void main(String[] args) {
        smallest_ofthree_numbers();
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
