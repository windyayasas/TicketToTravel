/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Utility;

/**
 *
 * @author windya yasas
 */
public class Validator {
    
    public boolean userEmptFieldsVt(String userName, String email, String password, String address, String secretQuestion, String answer, String location, String role) {

        if (userName.isEmpty()) {
            return false;
        }
        if (email.isEmpty()) {
            return false;
        }
        if (password.isEmpty()) {
            return false;
        }
        if (address.isEmpty()) {
            return false;
        }
        if (secretQuestion.isEmpty()) {
            return false;
        }
        if (answer.isEmpty()) {
            return false;
        }
        if (location.isEmpty()) {
            return false;
        }
        if (role.isEmpty()) {
            return false;
        }

        return true;

    }
    
       public boolean isValidEmailAddress(String email) {
           String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(email);
           return m.matches();
    }
    
    
    
    
}
