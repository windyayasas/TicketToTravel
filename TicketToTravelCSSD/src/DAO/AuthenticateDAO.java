/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.SetOfUsers;
import Models.User;
import static Utility.Serialization.desirializeUser;
import java.io.IOException;

/**
 *
 * @author windya yasas
 */
public class AuthenticateDAO {

    private final SetOfUsers stUsers;
    private User selectedUser;
    private static String Username;
    private static int UserID;
    private String Password;
    private String dbPassword;
    private static boolean auth;
    private String role;
    private SetOfUsers tmpUsers;

    public AuthenticateDAO(String Username, String Password) throws IOException, ClassNotFoundException {
        stUsers = desirializeUser();
        AuthenticateDAO.Username = Username;
        this.Password = Password;
        AuthenticateDAO.auth = false;
        tmpUsers=stUsers.getUserFromName(Username);
        

    }

    public static void setAuth(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getDbPassword() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getPassword() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
