package basicFlowLayout;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui extends JFrame{

	private JButton lb;
	private JButton cb;
	private JButton rb;
	private FlowLayout layout;
	private Container container;
	
	
	public Gui(){
		super("FlowLayout");
		layout = new FlowLayout();
		container = getContentPane();
		setLayout(layout);
		
		//Sets the layout to LEFT
		lb = new JButton("Left");
		add(lb);
		lb.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						layout.setAlignment(FlowLayout.LEFT); 
						layout.layoutContainer(container); 
					}
				}
			);
		
		//Sets the layout to the CENTER
		cb = new JButton("Center");
		add(cb);
		cb.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						layout.setAlignment(FlowLayout.CENTER); 
						layout.layoutContainer(container);
					}
				}
			);
		
		//Sets the layout to the RIGHT
		rb = new JButton("Right");
		add(rb);
		rb.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						layout.setAlignment(FlowLayout.RIGHT); 
						layout.layoutContainer(container);
					}
				}
			);
	}
	
	
}

