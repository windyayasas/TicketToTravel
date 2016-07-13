package Models;

public class Account {
    
    private int accountNo;
    private Passenger aPassenger;
    private double balance;
    private double loanAmount;
    private static int accountCount=0;

    public Account(Passenger aPassenger, double balance, double loanAmount) {
        this.accountNo = ++accountCount;
        this.aPassenger = aPassenger;
        this.balance = balance;
        this.loanAmount = loanAmount;
    }
    
    public Account()
    {
        this.accountNo=0;
        this.aPassenger=null;
        this.balance=0;
        this.loanAmount=0;
    }
    
    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public Passenger getaPassenger() {
        return aPassenger;
    }

    public void setaPassenger(Passenger aPassenger) {
        this.aPassenger = aPassenger;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    
    
    
  
    
}
