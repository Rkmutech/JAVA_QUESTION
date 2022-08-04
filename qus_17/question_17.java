package qus_17;

public class question_17 {
    public static void  sides_of_shape(int a)
    {
switch (a)
  {
    case 3:
    System.out.println("The shape name is Triangle");
    break;
    case 4:
    System.out.println("The shape name is Square or Rectangle or Parallelogram or Rhombus or Trapezium or Kite ");
    break;
    case 5:
    System.out.println("The shape name is Pentagon");
    break;
    case 6:
    System.out.println("The shape name is Hexagon");
    break;
    case 7:
    System.out.println("The shape name is Heptagon");
    break;
    case 8:
    System.out.println("The shape name is Octagon");
    break;
    case 9:
    System.out.println("The shape name is Nonagon");
    break;
    case 10:
    System.out.println("The shape name is Decagon");
    break;
    default:
    System.out.println("invalid shape");
  }
    }
    public static void main(String[] args) {
        sides_of_shape(3);
        sides_of_shape(7);
        sides_of_shape(9);
        sides_of_shape(5);
        sides_of_shape(4);
        sides_of_shape(6);
        sides_of_shape(10);
        sides_of_shape(2);
        sides_of_shape(1);
        sides_of_shape(8);

    }
    
}
