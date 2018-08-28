package basicMouseEvents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Gui extends JFrame {
	
	private JPanel mousepanel; 
	private JLabel statusbar; 
	
	
	public Gui(){
		super("Mouse Events");
		
		mousepanel = new JPanel();
		mousepanel.setBackground(Color.WHITE); 
		add(mousepanel,BorderLayout.CENTER);
		
		statusbar = new JLabel("default");
		add(statusbar, BorderLayout.SOUTH);
		
		Handlerclass handler = new Handlerclass(); 
		mousepanel.addMouseListener(handler);
		mousepanel.addMouseMotionListener(handler);
	}
	
	private class Handlerclass implements MouseListener, MouseMotionListener{
		
		
		
		public void mouseClicked(MouseEvent event){
			statusbar.setText(String.format("Clicked at %d %d", event.getX(), event.getY()));// u get the X and Y coordinate where the event happen;
		}
		public void mousePressed(MouseEvent event){ 
			statusbar.setText("You pressed down the mouse");
		}
		public void mouseReleased(MouseEvent event){
			statusbar.setText("You released the mouse");
		}
		public void mouseEntered(MouseEvent event){
			statusbar.setText("You entered the area");
			mousepanel.setBackground(Color.RED);
		}
		public void mouseExited(MouseEvent event){
			statusbar.setText("The mouse has left the window");
			mousepanel.setBackground(Color.WHITE);
		}
		
		
		
		public void mouseDragged(MouseEvent event){
			statusbar.setText("Dragging the mouse");
		}
		public void mouseMoved(MouseEvent event){ 
			statusbar.setText("You are moving the mouse");
		}
		
	}

}
