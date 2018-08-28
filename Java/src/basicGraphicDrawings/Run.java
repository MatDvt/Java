package basicGraphicDrawings;

import javax.swing.JFrame;

public class Run {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Gui g = new Gui();
		f.add(g);
		f.setSize(300, 200);
		f.setVisible(true);

	}

}
