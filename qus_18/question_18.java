package qus_18;

import java.util.Scanner;

public class question_18 {
   public static void month_name(String month1) {
   // String month=Getstring("Enter the Your month:");
    switch(month1)
    {
        case "January":
        System.out.println("The Total number days= 31");
        break;
        case "February":
        System.out.println("The Total number days= 28");
        break;
        case "March":
        System.out.println("The Total number days= 31");
        break;
        case "April":
        System.out.println("The Total number days= 30");
        break;
        case "May":
        System.out.println("The Total number days= 31");
        break;
        case "June":
        System.out.println("The Total number days= 30");
        break;
        case "july":
        System.out.println("The Total number days= 31");
        break;
        case "August":
        System.out.println("The Total number days= 31");
        break;
        case "Setember":
        System.out.println("The Total number days= 30");
        break;
        case "October":
        System.out.println("The Total number days= 31");
        break;
        case "Novmber":
        System.out.println("The Total number days= 30");
        break ;
        case "December":
        System.out.println("The Total number days= 31");
        break ;
    }


   } 
    
    public static void main(String[] args) {
        month_name("January");
       month_name("February");
       month_name("March");
       month_name("April");
       month_name("May");
       month_name("June");
       month_name("July");
       month_name("August");
       month_name("September");
       month_name("October");
       month_name("November");
       month_name("December");
       // System.out.println("The Total number days= "+);
    }
    public static String Getstring(String message)
    {
        printmessage(message);
        Scanner sc=new Scanner(System.in);
        String temp=sc.nextLine();
        return temp;

    }
    public static void printmessage(String message)
    {
        System.out.println(message);
    }
    
}
