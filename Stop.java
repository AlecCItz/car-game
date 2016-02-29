import java.util.*;
/**
 * Write a description of class Stops here.
 * 
 * Benjamin Boudreau
 * 2/29/16
 */
public class Stop
{
   private char label;
   private int x, y;
   
   public Stop()
   {
       this('A', 1000, 1000);
   }
   public Stop(char l, int width, int length)
   {
       Random r = new Random();
       label = l;
       x = r.nextInt(width);
       y = r.nextInt(length);
   }
   public int getX()
   {
       return x;
   }
   public int getY()
   {
       return y;
   }
   public int getLabel()
   {
       return label;
   }
}
