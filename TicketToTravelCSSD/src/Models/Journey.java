package Models;

import java.io.Serializable;

/**
 *
 * @author Chathuri Lakmini
 */
public class Journey implements Serializable {
    
    private int JourneyId;
    
    private String StartLocation;
    
    private String EndLocation;
    
    private double Distance;
    
    private String StartTime;
    
    private String EndTime;
    
    private int PassengerCount;
    
    private double CostPerKilometer;
    
    private static int JourneyCount=0;

    public Journey() {
        
        this.JourneyId=0;
        this.StartLocation=null;
        this.EndLocation=null;
        this.EndLocation=null;
        this.Distance=0;
        this.StartTime=null;
        this.EndTime=null;
        this.PassengerCount=0;
        this.CostPerKilometer=0;
    }

    
    public Journey(String StartLocation, String EndLocation, double Distance, String StartTime, String EndTime, int PassengerCount, double CostPerKilometer) {
        
        this.JourneyId=++JourneyCount;
        this.StartLocation = StartLocation;
        this.EndLocation = EndLocation;
        this.Distance = Distance;
        this.StartTime = StartTime;
        this.EndTime = EndTime;
        this.PassengerCount = PassengerCount;
        this.CostPerKilometer = CostPerKilometer;
    }
    
    public int getJourneyId() {
        return JourneyId;
    }

    public void setJourneyId(int JourneyId) {
        this.JourneyId = JourneyId;
    }

    public String getStartLocation() {
        return StartLocation;
    }

    public void setStartLocation(String StartLocation) {
        this.StartLocation = StartLocation;
    }

    public String getEndLocation() {
        return EndLocation;
    }

    public void setEndLocation(String EndLocation) {
        this.EndLocation = EndLocation;
    }

    public double getDistance() {
        return Distance;
    }

    public void setDistance(double Distance) {
        this.Distance = Distance;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public int getPassengerCount() {
        return PassengerCount;
    }

    public void setPassengerCount(int PassengerCount) {
        this.PassengerCount = PassengerCount;
    }

    public double getCostPerKilometer() {
        return CostPerKilometer;
    }

    public void setCostPerKilometer(double CostPerKilometer) {
        this.CostPerKilometer = CostPerKilometer;
    }
     
}
