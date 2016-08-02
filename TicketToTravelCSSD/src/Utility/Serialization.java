package Utility;

import Models.Inspector;
import Models.Route;
import Models.SetOfInspectors;
import Models.SetOfPassengers;
import Models.SetOfPublicTransportManagers;
import Models.SetOfRoutes;
import Models.SetOfUsers;
import Models.User;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Chathuri Lakmini
 */
public class Serialization {

    public static void serializeUser(SetOfUsers userSet) throws IOException {

        SetOfUsers INSTANCE = SetOfUsers.getInstance();
        INSTANCE = userSet;

        try (FileOutputStream fileOut = new FileOutputStream("UserData.ser")) {
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(INSTANCE);
            out.flush();
            out.close();
        }
        System.out.println("Serialized data is saved UserData.ser");

    }
    

    public static SetOfUsers desirializeUser() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(new File("UserData.ser"));
        ObjectInputStream ois = new ObjectInputStream(fis);
        SetOfUsers users = SetOfUsers.getInstance();
        users= (SetOfUsers) ois.readObject();
        
        return users;

    }
    
    
    public static void serializeInspector(SetOfInspectors userSet) throws IOException {

        SetOfInspectors INSTANCE = SetOfInspectors.getInstance();
        INSTANCE = userSet;

        try (FileOutputStream fileOut = new FileOutputStream("InspectorData.ser")) {
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(INSTANCE);
            out.flush();
            out.close();
        }
        System.out.println("Serialized data is saved InspectorData.ser");

    }
    
    public static SetOfInspectors desirializeInspector() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(new File("InspectorData.ser"));
        ObjectInputStream ois = new ObjectInputStream(fis);
        SetOfInspectors users = SetOfInspectors.getInstance();
        users= (SetOfInspectors) ois.readObject();
        
        return users;

    }
    
    public static void serializePublicTransportManager(SetOfPublicTransportManagers userSet) throws IOException {

        SetOfPublicTransportManagers INSTANCE = SetOfPublicTransportManagers.getInstance();
        
        INSTANCE = userSet;

        try (FileOutputStream fileOut = new FileOutputStream("PublicTransportManagerData.ser")) {
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(INSTANCE);
            out.flush();
            out.close();
        }
        System.out.println("Serialized data is saved PublicTransportManagerData.ser");

    }
    
    public static SetOfPublicTransportManagers desirializePublicTransportManager() throws IOException, ClassNotFoundException {
        
        FileInputStream fis = new FileInputStream(new File("PublicTransportManagerData.ser"));
        
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        SetOfPublicTransportManagers users = SetOfPublicTransportManagers.getInstance();
        
        users= (SetOfPublicTransportManagers) ois.readObject();
        
        return users;

    }
    
    public static void serializePassenger(SetOfPassengers userSet) throws IOException {

        SetOfPassengers INSTANCE = SetOfPassengers.getInstance();
        
        INSTANCE = userSet;

        try (FileOutputStream fileOut = new FileOutputStream("PassengerData.ser")) {
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(INSTANCE);
            out.flush();
            out.close();
        }
        System.out.println("Serialized data is saved PassengerData.ser");

    }
    
    public static SetOfPassengers desirializePassenger() throws IOException, ClassNotFoundException {
        
        FileInputStream fis = new FileInputStream(new File("PassengerData.ser"));
        
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        SetOfPassengers users = SetOfPassengers.getInstance();
        
        users= (SetOfPassengers) ois.readObject();
        
        return users;

    }
    
   
    public static void serializeRoute(SetOfRoutes routeSet) throws IOException {
        
        FileOutputStream fo = new FileOutputStream("RouteData.ser");

        ObjectOutputStream os = new ObjectOutputStream(fo);

        os.writeObject(routeSet);

        os.flush();

        os.close();

        fo.close();

        System.out.println("Serialized data to RouteData.ser file");

    }

    public static void main(String args[]) throws IOException, ClassNotFoundException {

        User user1 = new User("Chat", "chat@gmailcom", "123456", "malabe", "What?", "Here", "xyz", "passenger");
        User user2 = new User("Chat", "chat@gmailcom", "123456", "malabe", "What?", "Here", "xyz", "passenger");
        
        
        Inspector useri1 = new Inspector("Chat", "chat@gmailcom", "123456", "malabe", "What?", "Here", "xyz", "passenger");
        Inspector useri2 = new Inspector("Chat", "chat@gmailcom", "123456", "malabe", "What?", "Here", "xyz", "passenger");
        
        
        
        user1.setUserId(1);
        user2.setUserId(2);
        
        SetOfUsers userSet = SetOfUsers.getInstance();

        userSet.add(user1);
        userSet.add(user2);

        serializeUser(userSet);
        
        
        useri1.setUserId(3);
        useri2.setUserId(4);
        
        SetOfInspectors userSet1 = SetOfInspectors.getInstance();

        userSet1.add(useri1);
        userSet1.add(useri2);

        serializeInspector(userSet1);

        SetOfUsers desUser = SetOfUsers.getInstance();
        SetOfInspectors desIns= SetOfInspectors.getInstance();

        Route aroute = new Route("Bus", "Mr.Bill");

        SetOfRoutes routeSet = new SetOfRoutes();

        routeSet.add(aroute);

        serializeRoute(routeSet);

        SetOfRoutes desRoute = new SetOfRoutes();

        desUser = desirializeUser();
        System.out.println(desUser);
        System.out.println(desUser.get(0).getAddress());
        
        desIns= desirializeInspector();
        
        System.out.println(desIns);
        System.out.println(desUser.get(0).getAddress());

    }

}
