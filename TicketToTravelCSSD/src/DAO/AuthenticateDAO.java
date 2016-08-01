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
    private static User currentUser;
    private static boolean auth;

    private SetOfUsers tmpUsers;

    public AuthenticateDAO(String Username, String Password) throws IOException, ClassNotFoundException {

        stUsers = desirializeUser();
        AuthenticateDAO.auth = false;
        tmpUsers = stUsers.getUserFromName(Username);
        tmpUsers = tmpUsers.getUserFromPassword(Password);

        if (tmpUsers.size() > 0) {
            AuthenticateDAO.currentUser = tmpUsers.get(0);
            AuthenticateDAO.auth = true;

        }

    }

    public static boolean getAuth() {
        return AuthenticateDAO.auth;
    }

    public static void setAuth(boolean auth) {
        AuthenticateDAO.auth = auth;
    }

    public static User getCurrentUser() {
        
       return  AuthenticateDAO.currentUser;
    }

}
