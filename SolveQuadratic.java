import java.util.*; // allows use of a scanner

public class SolveQuadratic 
{
    public static void main(String args[]) 
    {
      int a, b, c; //ax^2 + bx + c
      double discriminant; // b^2 - 4ac
      double root1, root2; // root1 for add, root2 for subtract
      Scanner keyboard = new Scanner(System.in); // creates an object
      
      System.out.print("Enter the coefficient of x^2: ");
      a = keyboard.nextInt();
      
      System.out.print("Enter the coefficient of x: ");
      b = keyboard.nextInt();
      
      System.out.print("Enter the constant: ");
      c = keyboard.nextInt();
      
      // Use the quadratic formula to compute the roots.
      //assumes a positive discrimniant
      
      discriminant = Math.pow(b, 2) - (4 * a * c);
      root1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
      root2 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);
      
      System.out.println ("Root #1 " + root1);
      System.out.println ("Root #2 " + root2);
    }
}