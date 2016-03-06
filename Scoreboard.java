
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
       topCarSpeed = new Car();
       topCarDistance = new Car();
       venue = new Venue();
    }

    public void determineSpeedPlacement(){
        for(int i = 0;  venue.totalRacers() > i; i++){
            if(venue.racers[i].getSpeed() > topCarSpeed.getSpeed()){
                topCarSpeed = venue.racers[i];
            }
        }
    }
    
    public Car getSpeedPlacement(){
        return topCarSpeed;
    }
    
    public void determineDistancePlacement(){
        for(int i = 0;  venue.totalRacers() > i; i++){
            if(venue.racers[i].getDistance() > topCarSpeed.getDistance()){
                topCarDistance = venue.racers[i];
            }
        }
    }
    
    public Car getDistancePlacement(){
        return topCarDistance;
    }
}
