/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eje5109
 */

import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Ethan
 */
public class NewCredential extends JFrame{
    private static final int FRAME_WIDTH = 450;
    private static final int FRAME_HEIGHT = 450;
    private JButton CreateCredential;
    private JButton Cancel;
    private JLabel TypeOfCredentialLabel;
    private JTextField CredentialType;
    private JLabel UsernameCredentialLabel;
    private JTextField CredentialUsername;
    private JLabel CredentialPasswordLabel;
    private JPasswordField CredentialPassword;
    private JLabel CredentialUserChoiceLabel;
    private JTextField CredentialCustom;
    
    /**
     * Creates new form NewJFrame
     */
    public NewCredential() {
            this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
                
            CredentialType = new JTextField(20);
            CredentialUsername = new JTextField(20);
            CredentialPassword = new JPasswordField();
            CredentialCustom = new JTextField(20);
            
            //JLabels
            TypeOfCredentialLabel = new JLabel("Type Of Credential:");
            CredentialUserChoiceLabel = new JLabel("Credential User Choice:");
            UsernameCredentialLabel = new JLabel("User Name Credential:");
            CredentialPasswordLabel = new JLabel("Password Credential:");

            
            
            //Jbuttons
            CreateCredential = new JButton("Submit");
            Cancel = new JButton("Cancel");
            this.add(createPanel());

        
    }
    private JPanel createPanel() 
	{
		JPanel panel = new JPanel(new GridLayout(5,2));
                panel.add(TypeOfCredentialLabel);
		panel.add(CredentialType);
                panel.add(UsernameCredentialLabel);
		panel.add(CredentialUsername);
                panel.add(CredentialPasswordLabel);
                panel.add(CredentialPassword);
                panel.add(CredentialUserChoiceLabel);
		panel.add(CredentialCustom);
                panel.add(CreateCredential);
                panel.add(Cancel);
		return panel;
	}
}




