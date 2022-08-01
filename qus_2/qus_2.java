package qus_2;
import java.util.Scanner;

public class qus_2 {
    
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("Enter the Any Number:");
        int num=number.nextInt();
        System.out.println("Enter the Any Number:");
        int num1=number.nextInt();
        if(num==num1)
        {
            System.out.println(num +" "+"same number");
        }else{
            System.out.println(num +" "+num1+" "+"Different number");
        }


    }
}
