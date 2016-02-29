import java.util.*;
/**
 * Write a description of class Venue here.
 * 
 * Benjamin Boudreau 
 * 2/24/16
 */
public class Venue
{
   private Scoreboard score;
   private Car[] racers;
   private int[][] stops;
   private int gridLength;
   private int gridWidth;
   
   /**
    * Constructor methods for class Venue
    */
   public Venue()
   {
       this(100, 100, 4);
   }
   public Venue(int l, int w, int num)
   {
       stops = new int[num][2];
       gridLength = l;
       gridWidth = w;
       setStops();
   }
   /**
    * Returns a set of coordinates for a stop
    */
   public int[] getStopPoint(int s)
   {
        return stops[s];
   }
   public Car getRacer(int c)
   {
       return racers[c];
   }
   /**
    * Sets all the stops in the stops array
    */
   public void setStops()
   {
       Random rand = new Random();
       for (int i = 0; i < stops.length; i++)
       {
           stops[i][0] = rand.nextInt(gridLength);
           stops[i][1] = rand.nextInt(gridWidth);
       }
   }
   /**
    * addRacer adds a car to the racer array
    */
   public void addRacer(Car c)
   {
       racers.add(c);
   }
   /**
    * removeRacer removes a car from the racer array
    */
   public void removeRacer(int index)
   {
       racers[index].remove();
   }
   /**
    * Returns the scoreboard
    */
   public Scoreboard getScore()
   {
       return score;
   }
   public void updateScore()
   {
       
   }
}
