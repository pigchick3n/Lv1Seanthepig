import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie cookie = new FortuneCookie();
		cookie.showButton();
	}

	public void showButton() {
		System.out.println("f");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton("Show me my fortune!");
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
	}

	// Make a class, main method and showButton method. Put a printout in the
	// showButton method. Instantiate your class and see that your printout works.
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int fortune = r.nextInt(5);
		if (fortune == 0) {
			JOptionPane.showMessageDialog(null, "Pick another fortune cookie.");
		} else if (fortune == 1){
		JOptionPane.showMessageDialog(null, "Error 404: Fortune not found.");
	
		}else if (fortune == 2) {
		
			JOptionPane.showMessageDialog(null, "Wow! You foun... never mind");
		}else if (fortune == 3) {
			JOptionPane.showMessageDialog(null, "Wow! You found the good one! You will be very happy for two seconds");
		}else if (fortune == 4) {
			JOptionPane.showMessageDialog(null, "Look somewhere else");
		}
			// Make a JFrame in showButton method and get it to show.

			// Make a JButton and add it to the JFrame.

			// Add an action listener to the button (auto fix the errors!!). When the button
			// is clicked, say “Woohoo”.

			// Generate a random number between 0 and 4. Depending on the random number,
			// show on of five fortunes.

		}
	}
