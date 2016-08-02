package Models;

import java.io.ObjectStreamException;

public class Inspector extends User {
    
    
    private Route assignedRoute;
    private boolean isAssiged;

    public Inspector() {
        assignedRoute=null;
        isAssiged=false;
        
    }

    public Inspector(String userName, String email, String password, String address, String secretQuestion, String answer, String location, String role) {
        super(userName, email, password, address, secretQuestion, answer, location, role);
        assignedRoute=null;
        isAssiged=false;
        
    }

    public Route getAssignedRoute() {
        return assignedRoute;
    }

    public void setAssignedRoute(Route assignedRoute) {
        this.assignedRoute = assignedRoute;
    }

    public boolean isAssiged() {
        return isAssiged;
    }

    public void setAssiged(boolean isAssiged) {
        this.isAssiged = isAssiged;
    }
    
    private static Inspector INSTANCE;

    public static Inspector getInstance() {

        if (INSTANCE == null) {

            synchronized (Inspector.class) {

                if (INSTANCE == null) {
                    INSTANCE = new Inspector();
                }
            }
        }

        return INSTANCE;
    }

    private Inspector readResolve() throws ObjectStreamException {
        return INSTANCE;
    }

   
    
    
    
    
}
