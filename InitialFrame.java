import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Ben
 */

public class InitialFrame extends JFrame {

    public InitialFrame() {
        super("PManagement");

        LoginPanel lp = new LoginPanel();
        add(lp);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350, 150);
        setResizable(false);
        setVisible(true);
    }

}
