package basicJCheckBox;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame {
 
	private JTextField text;
	private JCheckBox bold;
	private JCheckBox italic;
	
	public Gui(){
		super("Some text and checkboxes");
		
		setLayout(new FlowLayout());
		
		text = new JTextField("Some text goes here", 20); 
		text.setFont(new Font("serif", Font.PLAIN, 12)); 
		add(text);
		
		bold = new JCheckBox("Bold");
		italic = new JCheckBox("italic");
		
		add(bold);
		add(italic);
		
		HandlerClass handler = new HandlerClass();
		bold.addItemListener(handler);
		italic.addItemListener(handler);	
	}
	
	private class HandlerClass implements ItemListener{
		public void itemStateChanged(ItemEvent event){
			Font font = null;
			
			if(bold.isSelected() && italic.isSelected())
				font = new Font("Serif", Font.BOLD + Font.ITALIC, 12 );				
			
			else if(bold.isSelected())
				font = new Font("Serif", Font.BOLD, 12);
			
			else if (italic.isSelected())
				font = new Font("Serif", Font.ITALIC, 12);
				
				else 
					font = new Font("Serif", Font.PLAIN, 12);
			
			text.setFont(font);
			}

		}
}

