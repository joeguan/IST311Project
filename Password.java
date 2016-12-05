/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Big Bertha
 */
public class Password {
    
    private String value;
    private String oldValue = "";
    
    public Password(String val){
        value = val;   
    }
    
    //To later begin process of password generation usecase
    public String generatePassword() {
        return "this is a test";
    }
    
    //Returns password value as a string
    public String getPassword(){
        return value;
    }
    
    //Use when checking any previous value (not yet)
    public String getOldPassword(){
        if (oldValue.equals(""))
            return "N/A";
        return oldValue;
    }
    
    
}
