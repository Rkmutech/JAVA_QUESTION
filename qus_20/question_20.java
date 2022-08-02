package qus_20;

public class question_20 {
    public static void name_the_triangle(int a,int b,int c)
    {
      if(a==b && b==c)
      {
        System.out.println("The Name of Triangle is Equilateral");
      }
      else if(a==b || b==c || a==c || a==b)
      {
        System.out.println("The Name of Triangle is isosceles");
      }
      else {
        System.out.println("The Name of Triangle is Scalence");
      }
    }
    public static void main(String[] args) {
        name_the_triangle(45,67,89);
        name_the_triangle(90, 90, 90);
        name_the_triangle(50, 55, 55);
        name_the_triangle(50, 55, 50);
        name_the_triangle(50, 50, 55);
    }
    
}
