package Serialization;

import Models.Route;
import Models.SetOfRoutes;
import Models.SetOfUsers;
import Models.User;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Chathuri Lakmini
 */
public class Serialization 
{

    public static void serializeUser(SetOfUsers userSet) throws IOException
    {   
        FileOutputStream fo=new FileOutputStream("UserData.ser"); 
           
        ObjectOutputStream os=new ObjectOutputStream(fo); 
        
        os.writeObject(userSet);
        
        os.flush();
        
        os.close();
        
        fo.close();
        
        System.out.println("Serialized data to UserData.ser file");
        
        
    }

    public static SetOfUsers desirializeUser() throws IOException, ClassNotFoundException
    {
        FileInputStream fs=new FileInputStream(new File("UserData.ser")); 
        
        ObjectInputStream os=new ObjectInputStream(fs); 
        
        SetOfUsers books=(SetOfUsers)os.readObject();
        
        os.close(); 
        
        return books;
    
    }
    
    public static void serializeRoute(SetOfRoutes routeSet) throws IOException
    {   
        FileOutputStream fo=new FileOutputStream("RouteData.ser"); 
           
        ObjectOutputStream os=new ObjectOutputStream(fo); 
        
        os.writeObject(routeSet);
        
        os.flush();
        
        os.close();
        
        fo.close();
        
        System.out.println("Serialized data to RouteData.ser file");
        
        
    }
    
    
    public static void main(String args[]) throws ClassNotFoundException, IOException 
    {

        User user1 = new User("Chat", "chat@gmailcom", "123456", "malabe", "What?", "Here", "xyz","passenger");
        
        SetOfUsers userSet = new SetOfUsers();
        
        userSet.addUser(user1);
        
        serializeUser(userSet);
        
        SetOfUsers desUser=new SetOfUsers();
        
        
        Route aroute = new Route("Bus","Mr.Bill");
        
        SetOfRoutes routeSet = new SetOfRoutes();
        
        routeSet.add(aroute);
        
        serializeRoute(routeSet);
        
        SetOfRoutes desRoute=new SetOfRoutes();
        
             
    }

}
