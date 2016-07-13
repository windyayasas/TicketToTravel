package Models;

import java.util.Vector;

import Models.SetOfRoutes;

/**
 *
 * @author Chathuri Lakmini
 */
public class SetOfRoutes extends Vector<Models.Route> {

    public SetOfRoutes() {

        super();
    }

    public void addRoute(Models.Route aRoute) {
        
        super.add(aRoute);
    }

    public void removeRoute(Models.Route aRoute) {
        
        super.remove(aRoute);

    }

}
