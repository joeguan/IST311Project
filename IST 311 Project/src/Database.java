/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Big Bertha
 */
public class Database {
    
    String firstName;
    String lastName;
    String userName;
    String password;
    String securityQuestion;
    String securityAnswer;
    
    public Database(String fn, String ln, String un, String pw, String q, String a) {
        
        firstName = fn;
        lastName = ln;
        userName = un;
        password = pw;
        securityQuestion = q;
        securityAnswer = a;
    }
    
    public boolean verifyCredentials(String us, String pw) {
        if (us.equals(userName) && pw.equals(password))
            return true;
        return false;
    }
}
