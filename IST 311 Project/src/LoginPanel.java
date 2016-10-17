
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginPanel extends JPanel implements ActionListener{

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
            
            submit.addActionListener(this);
            newUser.addActionListener(this);
           
        }
        

    @Override
    public void actionPerformed(ActionEvent ae) {
             if(ae.getSource()== newUser)
            {
                new NewUser().setVisible(true);
            } 
             else if (ae.getSource() == submit)
             {
                 
             }       
        }
    }

