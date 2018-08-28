package basicJbuttonUse;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Gui extends JFrame {
	
	private JButton regular;
	private JButton custom;
	
	public Gui(){
		super("This is a title"); 
		
		setLayout(new FlowLayout()); 
		
		regular = new JButton("regular button");
		add(regular); 
		
		Icon a = new ImageIcon(getClass().getResource("a.png")); 
		Icon b = new ImageIcon(getClass().getResource("b.png"));
		custom = new JButton("Custom", b);
		custom.setRolloverIcon(a);
		add(custom);
		
		HandlerClass handler = new HandlerClass();
		regular.addActionListener(handler);
		custom.addActionListener(handler);	
		
	}
	
	private class HandlerClass implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
		}
		
	}

}
