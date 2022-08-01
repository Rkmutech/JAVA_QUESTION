package qus_16;

import java.util.Scanner;

public class question_16 {
    public static void vowels_check()
    {
        char name = GetChar("Enter the Any chars :");
       
        if (name == 'a' || name == 'e' || name == 'i' || name == 'o' || name == 'u'||name =='A' ||name=='E'||name=='I'||name=='O'||name=='U')
        {
            System.out.println("Yes this char is vowel");
            
    
        }
        else
        {
            System.out.println("This char is constant");
        }
    }
    public static void main(String[] args) {
        vowels_check();
        
    }
    public static char GetChar(String message)
    {
        PrintMessage(message);
        Scanner sc=new Scanner(System.in);
        char temp=sc.next().charAt(0);
        return temp;
    }
    public static void PrintMessage(String message)
    {
        System.out.println(message);
    }
    
}
