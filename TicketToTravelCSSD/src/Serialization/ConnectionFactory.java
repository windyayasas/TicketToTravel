/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serialization;

/**
 *
 * @author windya yasas
 */
import java.io.Serializable;

public class ConnectionFactory implements Serializable {

    //Static variable for holding singleton reference object
    private static ConnectionFactory INSTANCE;

    /**
     * Private constructor
     */
    private ConnectionFactory() {
    }

    /**
     * Static method for fetching the instance
     *
     * @return
     */
    public static ConnectionFactory getInstance() {
        //Check whether instance is null or not
        if (INSTANCE == null) {
            //Locking the class object
            synchronized (ConnectionFactory.class) {
    //Doing double check for the instance
                //This is required in case first time two threads simultaneously invoke 
                //getInstance().So when another thread get the lock,it should not create the 
                //object again as its already created by the previous thread.
                if (INSTANCE == null) {
                    INSTANCE = new ConnectionFactory();
                }
            }
        }

        return INSTANCE;
    }
}
