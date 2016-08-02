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
public class SetOfPublicTransportManager extends Vector<PublicTransportManager> {

    public SetOfPublicTransportManager(int initialCapacity, int capacityIncrement) {
        super(initialCapacity, capacityIncrement);
    }

    public SetOfPublicTransportManager(int initialCapacity) {
        super(initialCapacity);
    }

    public SetOfPublicTransportManager() {
        super();
    }

    public SetOfPublicTransportManager(Collection<? extends PublicTransportManager> c) {
        super(c);
    }
    
    private static SetOfPublicTransportManager INSTANCE;

    public static SetOfPublicTransportManager getInstance() {

        if (INSTANCE == null) {

            synchronized (SetOfInspectors.class) {

                if (INSTANCE == null) {
                    INSTANCE = new SetOfPublicTransportManager();
                }
            }
        }

        return INSTANCE;
    }

    private SetOfPublicTransportManager readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
    
    
    
}
