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
 * @author windya yasas
 */
public class SetOfPassengers extends Vector<Passenger>{

    public SetOfPassengers(int initialCapacity, int capacityIncrement) {
        super(initialCapacity, capacityIncrement);
    }

    public SetOfPassengers(int initialCapacity) {
        super(initialCapacity);
    }

    public SetOfPassengers() {
        super();
    }

    public SetOfPassengers(Collection<? extends Passenger> c) {
        super(c);
    }
    
    private static SetOfPassengers INSTANCE;

    public static SetOfPassengers getInstance() {

        if (INSTANCE == null) {

            synchronized (SetOfPassengers.class) {

                if (INSTANCE == null) {
                    INSTANCE = new SetOfPassengers();
                }
            }
        }

        return INSTANCE;
    }

    private SetOfPassengers readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
    
    
    
    
    
    
    
}
