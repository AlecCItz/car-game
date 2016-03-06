import java.util.concurrent.TimeUnit;

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car
{
    private String name;
    private int speed; //measured in mph
    private int distance; //measured in miles
    private int totalDistance;
    private double totalTime;
    //private Route route;
    private String color;
    //currentTimeMillis also possibility
    public Car()
    {
        distance = 0;
        speed = 0;
        drive();
    }
    
    public Car(int d, int s)
    {
        distance = d;
        speed = s;
        drive();
    }
    
    private void drive(){
        long timeElapsed = 0;
        timeElapsed = System.nanoTime();
        double seconds = TimeUnit.NANOSECONDS.toSeconds(timeElapsed);
        if(distance == (speed/60)*seconds){
            totalTime = totalTime + seconds;
            totalDistance = totalDistance + distance;
            stop();
        }
    }
    
    private void stop(){
        try{
            Thread.sleep(5000);
        } catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
        drive();
    }

    public String getName(){
        return name;
    }

    public int getDistance(){
        return totalDistance;
    }

    public double getTime(){
        return totalTime;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setDistance(int d){
        distance = d;
    }
    
    public void setTime(int t){
        totalTime = t;
    }
    
    public void setSpeed(int s){
        speed = s;
    }
    
    public void setColor(String c){
        color = c;
    }
}
