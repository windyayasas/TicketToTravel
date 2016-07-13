package Models;

public class Fare {
    
    private int fareId;
    private double totalAmount;
    private String type;
    private double discount;
    private static int fareCount=0;

    public Fare() {
        this.fareId=0;
        this.totalAmount=0;
        this.type=null;
        this.discount=0;
    }

    public Fare(double totalAmount, String type, double discount) {
        this.fareId=++fareCount;
        this.totalAmount = totalAmount;
        this.type = type;
        this.discount = discount;
    }

    
    public int getFareId() {
        return fareId;
    }

    public void setFareId(int fareId) {
        this.fareId = fareId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    
    
}
