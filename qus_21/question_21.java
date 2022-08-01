package qus_21;

import java.util.Scanner;

public class question_21 {
    public static void grade_points()
        {
            int number1 = GetInteger("Enter your marks:");
            
            if(number1>=90)
            {
                System.out.println("Your Grade is A");
            }
            else if(number1>=80)
            {
                System.out.println("Your Grade is B");
            }
            else if (number1 >= 60)
            {
                System.out.println("Your Grade is c");
            }
            else if (number1 >= 50)
            {
                System.out.println("Your Grade is D");
            }
            else if (number1 < 50)
            {
                System.out.println("Your Grade is F");
            }

        }
        public static void main(String[] args) {
           
            grade_points();
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
