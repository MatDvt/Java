import javax.swing.JOptionPane;

public class BasicGuiSumNumbers {

	public static void main(String[] args) {
		
			
			String fn = JOptionPane.showInputDialog("Enter your first number");
			String sn = JOptionPane.showInputDialog("Enter your second number"); // a basic dialog box
			
			int num1 = Integer.parseInt(fn); // convert the String to an int;
			int num2 = Integer.parseInt(sn); // convert the String to an int;
			int sum = num1+num2;
			
			JOptionPane.showMessageDialog(null,"The sum of the numbers is "+sum, "BOX", JOptionPane.PLAIN_MESSAGE);
	}

}
