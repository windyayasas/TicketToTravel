package Models;

public class Passenger extends User {
    
    private boolean isActivated;

    public Passenger() {
    }

    public Passenger(String userName, String email, String password, String address, String secretQuestion, String answer, String location, String role) {
        super(userName, email, password, address, secretQuestion, answer, location, role);
    }
    
    
    
    
}
