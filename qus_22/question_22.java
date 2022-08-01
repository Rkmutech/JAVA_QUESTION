package qus_22;

import java.util.Scanner;

public class question_22 {
    public static void chess_bord()
    {
        int number=Getint("Enter the A Number 1 t0 8:");
        char ch1=Getchar("Enter the A char A to h:");
        if(number%2==0)
            {
              if(ch1=='A'||ch1=='a'||ch1=='c'||ch1=='C'||ch1=='E'||ch1=='e'||ch1=='G'||ch1=='g')
                {
                    System.out.println("white");
                }
              else if(ch1=='B'||ch1=='b'||ch1=='D'||ch1=='d'||ch1=='F'||ch1=='f'||ch1=='H'||ch1=='h')
                {
                    System.out.println("Black");
                }
            }
           else if(number%2==1)
            {
                if (ch1 == 'A' || ch1 == 'a' || ch1 == 'c' || ch1 == 'C' || ch1 == 'E' || ch1 == 'e' || ch1 == 'G' || ch1 == 'g')
                {
                    System.out.println("Black");
                }
                else if (ch1 == 'B' || ch1 == 'b' || ch1 == 'D' || ch1 == 'd' || ch1 == 'F' || ch1 == 'f' || ch1 == 'H' || ch1 == 'h')
                {
                    System.out.println("white");
                }

            }

        }
        public static void main(String[] args) {
            chess_bord();
        }
        public static int Getint(String message)
        {
            printmessage(message);
            Scanner sc=new Scanner(System.in);
            int temp=sc.nextInt();
            return temp;
        }
        public static char Getchar(String message)
        {
            printmessage(message);
            Scanner sc=new Scanner(System.in);
            char temp=sc.next().charAt(0);
            return temp;
        }
        public static void printmessage(String message)
    
        {
           System.out.println(message);
        }
    }

    

