package qus_3;

import java.util.Scanner;

public class floating_point {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
    
        System.out.println("Enter the Any Number:");
        float num=number.nextFloat();
        System.out.println("Enter the Any Number:");
        float num1=number.nextFloat();
        if(num==num1)
        {
            System.out.println(num +" "+"same number");
        }else{
            System.out.println(num +" "+num1+" "+"Different number");
        }

    }
    
}
