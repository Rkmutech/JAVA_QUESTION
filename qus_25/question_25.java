package qus_25;

import java.util.Scanner;

public class question_25 {
    public static void main(String[] args) {
        
        menu_drive();
    }
    public static void menu_drive()
        {
            System.out.println("Add the two numbers Enter 1:");
            System.out.println("subtraction the two numbers Enter 2:");
            System.out.println("Multiplication of two numbers Enter  3:");
            System.out.println("Division of two numbers Enter  4:");
            System.out.println("Modulo division of two numbers Enter 5:");
            int number = GetInteger("Enter the Number 1 to 5 :");
            int number1 = GetInteger("Enter your first number for your calculation:");
            int number2 = GetInteger("Enter your second number for your claculation:");
            switch(number)
            {
                case 1:
                //return number1+number2;
                System.out.println( number1+number2);
                break;
                case 2:
                System.out.println(number1-number2);
                break;
                case 3:
                System.out.println(number1*number2);
                break;
                case 4:
                System.out.println(number1/number2);
                break;
                case 5:
                System.out.println(number1%number2);
                break;

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
