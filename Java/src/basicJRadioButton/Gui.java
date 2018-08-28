package basicJRadioButton;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame {

	private JTextField tf;
	private Font pf;
	private Font bf;
	private Font itf;
	private Font bif;
	
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bib;
	private ButtonGroup group;
	
	
	public Gui() {
		super("Title");
		
		setLayout(new FlowLayout());
		
		tf = new JTextField("Hello", 12);
		add(tf);
		
		pb = new JRadioButton("plain", true); 
		bb = new JRadioButton("bold", false);
		ib = new JRadioButton("italic", false);
		bib = new JRadioButton("bold&italic", false);
		add(pb);
		add(bb);
		add(ib);
		add(bib);
		
		group = new ButtonGroup(); 
		group.add(bb);
		group.add(pb);
		group.add(ib);
		group.add(bib);
		
		pf = new Font("Serif", Font.PLAIN, 12);
		bf = new Font("Serif", Font.BOLD, 12);
		itf = new Font("Serif", Font.ITALIC, 12);
		bif = new Font("Serif", Font.BOLD + Font.ITALIC, 12);
		tf.setFont(pf);
		
		pb.addItemListener(new HandlerClass(pf));
		bb.addItemListener(new HandlerClass(bf));
		ib.addItemListener(new HandlerClass(itf));
		bib.addItemListener(new HandlerClass(bif));
		
	}
	
	private class HandlerClass implements ItemListener{
		private Font font;
		
		private HandlerClass(Font f){
			font = f;			
		}
		
		public void itemStateChanged(ItemEvent event){
			tf.setFont(font);
		}
	}
	

}
