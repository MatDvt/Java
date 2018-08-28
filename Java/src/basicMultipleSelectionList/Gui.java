package basicMultipleSelectionList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Gui extends JFrame {

	private JList leftlist;
	private JList rightlist;
	private JButton movebutton;
	private static String[] foods = {"bacon", "veggies", "milk", "pork", "chicken", "beef"};
	
	public Gui(){
		super("MultiSelectionApp");
		setLayout (new FlowLayout());
		
		leftlist = new JList(foods);
		leftlist.setVisibleRowCount(3);
		leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(leftlist));
		
		movebutton = new JButton("Move--->");
		movebutton.addActionListener( 
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						rightlist.setListData(leftlist.getSelectedValues());
					}
				}
			);
		add(movebutton);
		
		rightlist = new JList();
		rightlist.setVisibleRowCount(3);
		rightlist.setFixedCellWidth(100);
		rightlist.setFixedCellHeight(15); 
		rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(rightlist));
	}
}
