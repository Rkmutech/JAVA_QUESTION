package qus_24;

public class question_24 

{
    public  static void profit_loss(int buy,int sales) 
    {

        
        System.out.println( (buy>sales)?"profit":"Loss");
    }
    public static void main(String[] args) {
           profit_loss(10,5);
           profit_loss(40,67);
           profit_loss(5,40);
           profit_loss(15,51);

    }
    
}
