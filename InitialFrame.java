
import java.awt.*;
import javax.swing.*;

public class InitialFrame extends JFrame {

    public InitialFrame() {
        super("Password Management");

        LoginPanel lp = new LoginPanel();
        add(lp);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 500);
        setResizable(false);
        setVisible(true);
    }

}
