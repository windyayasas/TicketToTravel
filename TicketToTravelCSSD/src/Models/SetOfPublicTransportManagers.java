/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Models;

import java.io.ObjectStreamException;
import java.util.Collection;
import java.util.Vector;

/**
 *
 * @author Chathuri Lakmini
 */
public class SetOfPublicTransportManagers extends Vector<PublicTransportManager> {

    public SetOfPublicTransportManagers(int initialCapacity, int capacityIncrement) {
        super(initialCapacity, capacityIncrement);
    }

    public SetOfPublicTransportManagers(int initialCapacity) {
        super(initialCapacity);
    }

    public SetOfPublicTransportManagers() {
        super();
    }

    public SetOfPublicTransportManagers(Collection<? extends PublicTransportManager> c) {
        super(c);
    }
    
    private static SetOfPublicTransportManagers INSTANCE;

    public static SetOfPublicTransportManagers getInstance() {

        if (INSTANCE == null) {

            synchronized (SetOfPublicTransportManagers.class) {

                if (INSTANCE == null) {
                    INSTANCE = new SetOfPublicTransportManagers();
                }
            }
        }

        return INSTANCE;
    }

    private SetOfPublicTransportManagers readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
    
    
    
}
