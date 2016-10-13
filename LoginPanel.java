
import java.awt.*;
import javax.swing.*;

public class LoginPanel extends JPanel {

        private JTextField username;
        private JPasswordField password;
        
        private JLabel u;
        private JLabel p;
        
        private JButton submit;
        private JButton newUser;
        
        public LoginPanel(){
            //initilizing
            setBackground(Color.LIGHT_GRAY);
            
            //Jtextfields
            username = new JTextField(20);
            password = new JPasswordField(20);
            
            //JLabels
            u = new JLabel("Username:");
            p = new JLabel("Password:");
            
            //Jbuttons
            submit = new JButton("Submit");
            newUser = new JButton("New User");
            
            //add
            add(u);
            add(username);
            add(p);
            add(password);
            add(submit);
            add(newUser);
           
        }

}
