package qus_11;

import java.util.Scanner;

public class question_11 {
    
    public static void  closer_each_other(){
        
        
        int number1=GetInteger("Enter the Number1: ");
        //PrintMessage(number1.toString());
        int number2=GetInteger("Enter the Number2: ");
        //PrintMessage(number2.toString());
        int number3=GetInteger("Enter the Number3: ");
       // PrintMessage(number3.toString());
       int differnt1=number1 - number2;
            int differnt2=number2 - number3;
            if(differnt1>differnt2)
            {
                System.out.println("number1 and number2 very close");

            }
            else
            {
                
                System.out.println("number2 and number3 very close");
            }
        }
        public static void main(String[] args) {
            closer_each_other();
            
        
        }
        public static int GetInteger(String message)
    {
        PrintMessage(message);
        Scanner obj=new Scanner(System.in);
        int temp=obj.nextInt();
        return temp;
    }
    public static void PrintMessage(String message)
    {
        System.out.println(message);
    }
    

    } 
    



