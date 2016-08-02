/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Models;

import java.util.Collection;
import java.util.Vector;

/**
 *
 * @author Chathuri Lakmini
 */
public class SetOfInspectors extends Vector<Inspector> {

    public SetOfInspectors(int initialCapacity, int capacityIncrement) {
        super(initialCapacity, capacityIncrement);
    }

    public SetOfInspectors(int initialCapacity) {
        super(initialCapacity);
    }

    public SetOfInspectors() {
        super();
    }

    public SetOfInspectors(Collection<? extends Inspector> c) {
        super(c);
    }
    
    
     
}
