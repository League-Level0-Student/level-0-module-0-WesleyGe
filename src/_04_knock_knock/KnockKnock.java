package _04_knock_knock;

import javax.swing.JOptionPane;

public class KnockKnock {
	public static void main(String[] args) {
		
	

String answer = JOptionPane.showInputDialog(null,"Knock Knock");
if (answer.equals("who's there?")) {
	String answer2 = JOptionPane.showInputDialog(null,"Who.");
	if (answer2.equals("who who")) {
		JOptionPane.showMessageDialog(null,"You sound like an owl you dumb fOk.");
	}

}else {
	JOptionPane.showMessageDialog(null,"Your not suppose to say that.");
	
}
}
}
