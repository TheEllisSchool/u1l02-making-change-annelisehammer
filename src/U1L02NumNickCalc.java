import javax.swing.JOptionPane;

//U1L02 Notes
//determine how many nickels and pennies
//needed to make a given amount of change,
//assuming those are the only coins you have.
public class U1L02NumNickCalc {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null,
				"How many cents do you have?");
		int userMoney = Integer.parseInt(input);
		
		//System.out.println(userMoney);
		
		int numbNicks = userMoney/5;
		int numbPens = userMoney - (numbNicks*5);
		
		JOptionPane.showMessageDialog(null, userMoney + " cents is"
				+ numbNicks + " nickels and "
				+ numbPens + " pennies.");
		

	}

}
