package qus_6;

import java.util.Scanner;

public class question_6 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter your Age:");
        int Age=obj.nextInt();
        System.out.println((Age>18)?"He or she is eligible for voting":"He or she not eligible for voting");
    }
    
}
