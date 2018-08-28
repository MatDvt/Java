package basicGraphicDrawings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JPanel {

	public void paintComponent(Graphics g){ 
		super.paintComponent(g);
		this.setBackground(Color.BLACK); 
		
		g.setColor(Color.BLUE);
		g.fillRect(25, 25, 100, 30);
		
		g.setColor(new Color(80,86,100)); 
		g.fillRect(25, 65, 100, 30);
		
		g.setColor(Color.RED);
		g.drawString("Some text here", 25, 120);
	}
	
}
