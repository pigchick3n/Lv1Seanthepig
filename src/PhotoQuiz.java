

	 // Copyright Wintriss Technical Schools 2013
	import java.awt.Component;
	import java.awt.Frame;
	import java.net.MalformedURLException;
	import java.net.URL;

	import javax.swing.Icon;
	import javax.swing.ImageIcon;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;

	public class PhotoQuiz {

		public static void main(String[] args) throws Exception {
			int score = 0;
			JFrame quizWindow = new JFrame();
			quizWindow.setVisible(true);
			quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
			String h = "http://media.wizards.com/2015/images/daily/cardart_VM_Jace-the-Mind-Sculptor.jpg";
			// 2. create a variable of type "Component" that will hold your image
			Component x;
			// 3. use the "createImage()" method below to initialize your Component
			x = createImage(h);
			// 4. add the image to the quiz window
			quizWindow.add(x);
			// 5. call the pack() method on the quiz window
			quizWindow.pack();
			// 6. ask a question that relates to the image
			String a =JOptionPane.showInputDialog("What Magic the Gathering card is this?");
			// 7. print "CORRECT" if the user gave the right answer
			if(a.equalsIgnoreCase("Jace, The Mind Sculpter")) {
				JOptionPane.showMessageDialog(null, "Correct");
				score+=10;
			}else {
				JOptionPane.showMessageDialog(null, "Incorrect");
				score-=10;
			}
			// 8. print "INCORRECT" if the answer is wrong

			// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
			quizWindow.remove(x);
			// 10. find another image and create it (might take more than one line of code)
			String n = "http://media.wizards.com/images/magic/daily/wallpapers/Black_Lotus_MTGOweek_iPad_Wallpaper_2.jpg";
			Component y;
			y = createImage(n);
			// 11. add the second image to the quiz window
			quizWindow.add(y);
			// 12. pack the quiz window
			quizWindow.pack();
			// 13. ask another question
			String b =JOptionPane.showInputDialog("What Magic the Gathering card is this?");	
			// 14+ check answer, say if correct or incorrect, etc.
			if(a.equalsIgnoreCase("Black Lotus")) {
				JOptionPane.showMessageDialog(null, "Correct");
				score+=10;
			}else {
				JOptionPane.showMessageDialog(null, "Incorrect");
				score-=10;
			}
			JOptionPane.showMessageDialog(null, "Your score is " + score);;
		}

		private static Component createImage(String h) throws MalformedURLException {
			URL url = new URL(h);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			return imageLabel;
		}

		/* OPTIONAL */
		// *14. add scoring to your quiz
		// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
	}






