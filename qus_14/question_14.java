package qus_14;

import java.util.Scanner;

public class question_14 {
    public static void Triangle()
    {
        int Angle1=Getint("Enter the Angle1:");
        int Angle2=Getint("Enter the Angle2:");
        int Angle3=Getint("Enter the Angle3:");
        int sum_Angles=Angle1+Angle2+Angle3;

        if(sum_Angles==180)
        {
            System.out.println("Yes Triangle");
        }else{
            System.out.println("This not Triangle");
        }
    }
    public static void main(String[] args) {
        
            Triangle();
        
        
    }
    public static int Getint(String message)
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
