/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import java.util.Random;

/**
 *
 * @author acer
 *
 * This class generates a random password when user try to reset his password
 */
public class PasswordGenerator {

    /*
     The method generate a password 
     no input parameter
     return string password
     */
    public static String getAPassword() {
        Random ran = new Random();
        int top = 5;
        char data = ' ';
        String dat = "";

        for (int i = 0; i <= top; i++) {
            data = (char) (ran.nextInt(25) + 97);
            dat = data + dat;
        }
        return dat;
    }

}
