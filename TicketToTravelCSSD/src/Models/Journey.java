package Models;

import java.io.Serializable;

public class Journey implements Serializable {
    
    private int journeyId;
    
    private String startLocation;
    
    private String endLocation;
    
    private double distance;
    
    private String startTime;
    
    private String endTime;
    
    private int passengerCount;
    
    private double costPerKilometer;
    
    private static int journeyCount=0;

    public Journey() {
        
        this.journeyId=0;
        this.startLocation=null;
        this.endLocation=null;
        this.distance=0;
        this.startTime=null;
        this.endTime=null;
        this.passengerCount=0;
        this.costPerKilometer=0;
    }

    
    public Journey(String startLocation, String endLocation, double distance, String startTime, String endTime, int passengerCount, double costPerKilometer) {
        
        this.journeyId=++journeyCount;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.distance = distance;
        this.startTime = startTime;
        this.endTime = endTime;
        this.passengerCount = passengerCount;
        this.costPerKilometer = costPerKilometer;
    }
    
    public int getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(int journeyId) {
        this.journeyId = journeyId;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public double getCostPerKilometer() {
        return costPerKilometer;
    }

    public void setCostPerKilometer(double costPerKilometer) {
        this.costPerKilometer = costPerKilometer;
    }
     
}
