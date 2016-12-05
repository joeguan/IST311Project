
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
    
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String securityQuestion;
    private String securityAnswer;
    private ArrayList<Credential> credentials;
    public Database(String fn, String ln, String un, String pw, String q, String a) {
        
        this.firstName = fn;
        this.lastName = ln;
        this.userName = un;
        this.password = pw;
        this.securityQuestion = q;
        this.securityAnswer = a;
        this.credentials = new ArrayList<Credential>();
        writeToSer(un);
    }
    
    //When logging into program, check username and password validity with this
    public boolean verifyLoginCredentials(String us, String pw) {
        getInfoFromFile(us);
        return us.equals(userName) && pw.equals(password);
    }
    
    //First step in displaying credentials on Main Menu, use along with getCredential calls in for loop.
    public ArrayList<Credential> getCredentials() {
        return credentials;
    }
    
    //Call this when adding a created credential to the active database in App
    public void addNewCredential(Credential toAdd) {
        credentials.add(toAdd);
    }
    
    public boolean accountExisted(String userName)
    {
        if(new File(userName+".ser").exists())
        {
            return true;
        }
        else 
            return false;
    }

    //write user information into a serilazation file
    private void writeToSer(String un) {
        try{
            FileOutputStream fo = new FileOutputStream(un+".ser");
            ObjectOutputStream os = new ObjectOutputStream(fo);
            os.writeObject(this);
            os.close();
            fo.close();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Cant not save your info into local", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
    
    //get user infomation out of serilaztion file
    private void getInfoFromFile(String username)
    {
        if(new File(userName+".ser").exists())
        {
            JOptionPane.showMessageDialog(null, "No such user", "Failed authentication", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try
        {
            FileInputStream fi = new FileInputStream (userName+".ser");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Write out the information failed", "Fetal Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
