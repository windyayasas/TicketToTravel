package Models;

import java.io.Serializable;

/**
 *
 * @author Chathuri Lakmini
 */
public class Route implements Serializable{
    
    private int RouteId; 
    
    private String TransportMode;
    
    private String Inspector;
    
    private static int RouteCount=0;

    public Route(String TransportMode, String Inspector) {
        
        this.RouteId = ++RouteCount;
        
        this.TransportMode = TransportMode;
        
        this.Inspector = Inspector;
    }

    public Route() {
        
        this.RouteId=0;
        this.Inspector=null;
        this.TransportMode=null;
    }

    public int getRouteId() {
        
        return RouteId;
    }

    public void setRouteId(int RouteId) {
        
        this.RouteId = RouteId;
    }

    public String getTransportMode() {
        
        return TransportMode;
    }

    public void setTransportMode(String TransportMode) {
        
        this.TransportMode = TransportMode;
    }

    public String getInspector() {
        
        return Inspector;
    }

    public void setInspector(String Inspector) {
        
        this.Inspector = Inspector;
    }
    
}
