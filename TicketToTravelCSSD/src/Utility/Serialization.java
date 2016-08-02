package Utility;

import Models.Inspector;
import Models.Passenger;
import Models.PublicTransportManager;
import Models.Route;
import Models.SetOfInspectors;
import Models.SetOfPassengers;
import Models.SetOfPublicTransportManager;
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
    
    public static void serializePublicTransportManager(SetOfPublicTransportManager userSet) throws IOException {

        SetOfPublicTransportManager INSTANCE = SetOfPublicTransportManager.getInstance();
        
        INSTANCE = userSet;

        try (FileOutputStream fileOut = new FileOutputStream("PublicTransportManagerData.ser")) {
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(INSTANCE);
            out.flush();
            out.close();
        }
        System.out.println("Serialized data is saved PublicTransportManagerData.ser");

    }
    
    public static SetOfPublicTransportManager desirializePublicTransportManager() throws IOException, ClassNotFoundException {
        
        FileInputStream fis = new FileInputStream(new File("PublicTransportManagerData.ser"));
        
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        SetOfPublicTransportManager users = SetOfPublicTransportManager.getInstance();
        
        users= (SetOfPublicTransportManager) ois.readObject();
        
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

        User user1 = new User("Chat", "chat@gmailcom", "123456", "malabe", "What?", "Here", "xyz", "Passenger");
        User user2 = new User("Nic", "chat@gmailcom", "123456", "malabe", "What?", "Here", "xyz", "Passenger");
       
        Inspector userI1 = new Inspector("Yasas", "Yasas@gmailcom", "123666", "malabe", "What?", "Here", "xyz", "Inspector");
        Inspector userI2 = new Inspector("Chathuri", "Chathuri@gmailcom", "123856", "malabe", "What?", "Here", "xyz", "Inspector");
        Inspector userI3 = new Inspector("Suchitha", "Suchitha@gmailcom", "102356", "malabe", "What?", "Here", "xyz", "Inspector");
        Inspector userI4 = new Inspector("Dumini", "Dumini@gmailcom", "89566", "malabe", "What?", "Here", "xyz", "Inspector");
        
        Passenger userP1 = new Passenger("Brain", "Brain@gmailcom", "893552", "kandy", "What?", "Here", "xyz", "Passenger");
        Passenger userP2 = new Passenger("Lee", "Lee@gmailcom", "254889", "matara", "Name?", "cook", "xyz", "Passenger");
        Passenger userP3 = new Passenger("Lara", "Lara@gmailcom", "893333", "kandy", "Age?", "6", "xyz", "Passenger");
        Passenger userP4 = new Passenger("Gorge", "Gorge@gmailcom", "255763", "matara", "What?", "Here", "xyz", "Passenger");
        
        PublicTransportManager userPT1 = new PublicTransportManager("Kenady", "Kenady@gmailcom", "111111", "kandy", "What?", "Ball", "pqr", "Transport manager");
        PublicTransportManager userPT2 = new PublicTransportManager("Silva", "Silva@gmailcom", "222222", "matara", "When?", "Monday", "pop", "Transport manager");
        PublicTransportManager userPT3 = new PublicTransportManager("John", "John@gmailcom", "444444", "kandy", "Who?", "Name", "xmz", "Transport manager");
        PublicTransportManager userPT4 = new PublicTransportManager("Marie", "Marie@gmailcom", "333333", "matara", "Name?", "Here", "xoz", "Transport manager");
  
        
        //user
        user1.setUserId(1);
        user2.setUserId(2);
        
        SetOfUsers userSet = SetOfUsers.getInstance();

        userSet.add(user1);
        userSet.add(user2);

        serializeUser(userSet);
        
        //Inspector
        userI1.setUserId(3);
        userI2.setUserId(4);
        userI3.setUserId(5);
        userI4.setUserId(6);
        
        SetOfInspectors userSet1 = SetOfInspectors.getInstance();

        userSet1.add(userI1);
        userSet1.add(userI2);
        userSet1.add(userI3);
        userSet1.add(userI4);
        
        serializeInspector(userSet1);
        
        //PublicTransportManager
        userPT1.setUserId(7);
        userPT2.setUserId(8);
        userPT3.setUserId(9);
        userPT4.setUserId(10);
        
        SetOfPublicTransportManager userSet2 = SetOfPublicTransportManager.getInstance();

        userSet2.add(userPT1);
        userSet2.add(userPT2);
        userSet2.add(userPT3);
        userSet2.add(userPT4);

        serializePublicTransportManager(userSet2);
        
        //Passenger
        userP1.setUserId(11);
        userP2.setUserId(12);
        userP3.setUserId(13);
        userP4.setUserId(14);
        
        SetOfPassengers userSet3 = SetOfPassengers.getInstance();

        userSet3.add(userP1);
        userSet3.add(userP2);
        userSet3.add(userP3);
        userSet3.add(userP4);
        
        serializePassenger(userSet3);

        
        
        SetOfUsers desUser = SetOfUsers.getInstance();
        SetOfInspectors desIns= SetOfInspectors.getInstance();
        SetOfPublicTransportManager desTransportManager= SetOfPublicTransportManager.getInstance();
        SetOfPassengers desPassengers= SetOfPassengers.getInstance();

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
        
        desTransportManager = desirializePublicTransportManager();
        System.out.println(desTransportManager);
        
        desPassengers = desirializePassenger();
        System.out.println(desPassengers);
        
    }

}
