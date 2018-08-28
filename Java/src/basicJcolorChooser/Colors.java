package basicJcolorChooser;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Colors extends JFrame {

	private JButton b;
	private Color color = (Color.BLACK);
	private JPanel panel;
	
	
	public Colors(){
		super("Colors");
		panel = new JPanel();
		panel.setBackground(color);
		
		b = new JButton("Choose a color");
		b.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						color = JColorChooser.showDialog(null, "pick your color", color);
						if(color==null)
							color = (Color.BLACK);
						
						panel.setBackground(color);
					}
				}
				);
		add(panel, BorderLayout.CENTER);
		add(b, BorderLayout.SOUTH);
		
	}
}
