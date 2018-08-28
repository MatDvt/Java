package basicJComboBox;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui extends JFrame {

	private JComboBox box;
	private JLabel picture;
	
	private static String [] filename = {"a.png", "b.png"}; 
	private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])), new ImageIcon(getClass().getResource(filename[1]))}; // this array holds the actual picture;
	
	public Gui(){
		super("The Title");
		setLayout(new FlowLayout());
		
		box = new JComboBox(filename); 
		
		box.addItemListener(
				new ItemListener(){
					
					public void itemStateChanged(ItemEvent event){
						if (event.getStateChange() == ItemEvent.SELECTED) 
							picture.setIcon(pics [box.getSelectedIndex()]);
					}
			}				
		); 
		
		add(box);
		picture = new JLabel(pics[0]);// this gives a default value for the list
		add(picture);
	}
}

