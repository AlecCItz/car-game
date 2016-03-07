
/**
 * Scoreboard class
 * 
 * @author Alec Itzaina
 */
public class Scoreboard
{
    Car topCarSpeed;
    Car topCarDistance;
    Venue venue;
    /**
     * Constructor for objects of class Scoreboard
     */
    public Scoreboard()
    {
        this(new Venue());
    }
    public Scoreboard(Venue v)
    {
       topCarSpeed = new Car();
       topCarDistance = new Car(); 
       venue = v;
    }

    public void determineSpeedPlacement(){
        for(int i = 0;  venue.totalRacers() > i; i++){
            if(venue.getRacers()[i].getSpeed() > topCarSpeed.getSpeed()){
                topCarSpeed = venue.getRacers()[i];
            }
        }
    }
    
    public Car getSpeedPlacement(){
        return topCarSpeed;
    }
    
    public void determineDistancePlacement(){
        for(int i = 0;  venue.totalRacers() > i; i++){
            if(venue.getRacers()[i].getDistance() > topCarSpeed.getDistance()){
                topCarDistance = venue.getRacers()[i];
            }
        }
    }
    
    public Car getDistancePlacement(){
        return topCarDistance;
    }
}
