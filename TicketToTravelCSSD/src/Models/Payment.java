package Models;

public class Payment {
    
    private int paymentId;
    private double amount;
    private String branchName;
    private String payDate;
    private int paymentCount=0;

    public Payment(double amount, String branchName, String payDate) {
        this.paymentId=++paymentCount;
        this.amount = amount;
        this.branchName = branchName;
        this.payDate = payDate;
    }

    public Payment() {
        
        this.paymentId=0;
        this.amount=0;
        this.branchName=null;
        this.payDate=null;
        
    }
   

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public int getPaymentCount() {
        return paymentCount;
    }

    public void setPaymentCount(int paymentCount) {
        this.paymentCount = paymentCount;
    }
    
    
    
    
    
}
