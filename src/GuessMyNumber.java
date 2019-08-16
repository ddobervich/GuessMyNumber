import javax.swing.JOptionPane;

public class GuessMyNumber {

	public static void main(String[] args) {

		int guess, secret;
		
		do {
			secret = 7;

			String response;
			response = JOptionPane.showInputDialog("Type a number");
			guess = Integer.parseInt(response);

			if (guess == secret) {
				System.out.println("You got it!");
			}

			if (guess != secret) {
				System.out.println("Nope.");
			}

		} while (guess != secret);
	}
}
