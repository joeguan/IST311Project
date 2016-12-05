import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MainUI extends JFrame {
  DefaultTableModel model = new DefaultTableModel(new Object[][] {
      { "some", "text", "fill", "in" }, { "any", "text", "for" ,"credentials" }, { "even", "more" },
      { "text", "strings" }, { "and", "other" }, { "text", "values" } },
      new Object[] { "Credential Type", "Credential Username","Credential Password","Credential Custom" });
  private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 400;
  private JButton CreateNewCredential;
  private JButton password;
  private JButton Logout;

  public MainUI() {
      this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JTable table = new JTable(model);
    getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);
    CreateNewCredential = new JButton("Create New Credential");
    password = new JButton("Generate Rondom Password");
    password.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null,"Random password: "+genRandomPwd());
		}
	});
    JPanel jp = new JPanel();
    jp.add(CreateNewCredential);
    jp.add(password);
    this.add(jp, BorderLayout.SOUTH);
    

  }

  public static String genRandomPwd(){
	  
	  final int  maxNum = 62;
	  int i;  
	  int count = 0; 
	  char[] str = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
	    'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
	    'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
	    'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
	    'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	  
	  StringBuffer pwd = new StringBuffer("");
	  Random r = new Random();
	  while(count < 15){

	   
	   i = Math.abs(r.nextInt(maxNum));  
	   
	   if (i >= 0 && i < str.length) {
	    pwd.append(str[i]);
	    count ++;
	   }
	  }
	  
	  return pwd.toString();
	 }
}