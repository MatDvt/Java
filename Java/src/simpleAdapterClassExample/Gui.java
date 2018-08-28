package simpleAdapterClassExample;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Gui extends JFrame{
	

	private String details;
	private JLabel statusbar;
	
	public Gui(){
		super("Adapter Class");
		
		statusbar = new JLabel("This is default");
		add(statusbar,BorderLayout.CENTER);
		addMouseListener(new MouseClass());
	}
	
	private class MouseClass extends MouseAdapter{
		public void mouseClicked(MouseEvent event){
			details = String.format("You clicked %d", event.getClickCount());
			if(event.isMetaDown()) 
				details += "With right mouse button";
			else if(event.isAltDown())
				details += "With center mouse button";
			else
				details += "Left mouse button";
			
			statusbar.setText(details);
		}
		
	}
}