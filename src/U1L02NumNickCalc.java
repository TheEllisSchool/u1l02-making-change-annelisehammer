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
		
		int numbQuarts= userMoney/25;
		int leftover = userMoney % 25;
		int numbDimes= leftover/ 10;
		int leftover2= leftover % 10;
		int numbNicks= leftover2/5;
		int numbPennies= leftover2 % 5;
		//int numbQuarts= userMoney/25;
		//int leftover= userMoney- (numbQuarts*25);
	
		//int numbDimes= leftover/10;
		//int leftover2= leftover- (numbDimes*10);
		
		//int numbNicks = leftover2/5;
		//int numbPens = leftover2 - (numbNicks*5);
		
		JOptionPane.showMessageDialog(null, userMoney + " cents is "
				+ numbQuarts + "quarters and"
				+ numbDimes + "dimes and"
				+ numbNicks + " nickels and "
				+ numbPennies + " pennies.");
		

	}

}
