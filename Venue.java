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
   private Stop[] stops;
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
       gridLength = l;
       gridWidth = w;
       setStops();
   }
   
   /**
    * Returns a set of coordinates for a stop
    */
   public Stop getStopPoint(int s)
   {
        return stops[s];
   }
   
   public Car getRacer(int c)
   {
       return racers[c];
   }
   
   public int totalRacers(){
       return racers.length;
    }
   
   /**
    * Sets all the stops in the stops array
    */
   public void setStops()
   {
       Random rand = new Random();
       char[] label = new char[4];
       label[0] = 'A';
       label[1] = 'B';
       label[2] = 'C';
       label[3] = 'D';
       for (int i = 0; i < stops.length; i++)
       {
           stops[i] = new Stop(label[i], gridWidth, gridLength);
       }
   }
   
   /**
    * Returns all the racers
    */
   public Car[] getRacers()
   {
       return racers;
   }
   
   /**
    * addRacer adds a car to the racer array
    */
   public void addRacer(Car c)
   {
       //racers.add(c);
   }
   
   /**
    * removeRacer removes a car from the racer array
    */
   public void removeRacer(int index)
   {
       //racers[index].remove();
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
