import java.lang.Math;
public class RandomNumber {
    public static void main(String args[]) {
      int x=11;
      double y = Math.random();
      int z=(int)(x*y);

      System.out.println("Some random number " + z);
    }
}