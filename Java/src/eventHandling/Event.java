package eventHandling; 
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Event {
	public static void main(String []args){
		
		SubEvent event = new SubEvent();
		
		event.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		event.setSize(350,100); 
		event.setVisible(true); 
	}

}
