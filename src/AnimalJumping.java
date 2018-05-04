
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AnimalJumping {
	JFrame frame = new JFrame("Directed By Michael Bay");
	JLabel label = new JLabel();
	String urlOfAnimalSuckingAtJumping = "http://i.imgur.com/Jdt1rRf.gif";
	 public static void main(String[] args) throws MalformedURLException {
		 AnimalJumping aj = new AnimalJumping();
		 aj.run();
	        /* We want to show an animation of an animal sucking at jumping inside a JFrame.
	         * Once you have chosen from http://animalssuckingatjumping.tumblr.com/, right click and "Copy Image URL" or “Copy Image Address”
	         * Your program must:
	         * 		- show the animation in full without any user interaction. You don’t need a JPanel since it’s only one JComponent.
	         * 		- show the animation in the center of the screen. Clue: frame.setLocationRelativeTo(null)
	         * 		- have a title such as "Gerbil Fail"
	         */

		 	
		 	
	    }
	 void run() throws MalformedURLException{
		 label=createImage(urlOfAnimalSuckingAtJumping);
		 frame.add(label);
		 frame.setVisible(true);
		 frame.setSize(750, 750);
		 frame.setLocationRelativeTo(null);
		 

		 
	 }
	 static JLabel createImage(String imageURL) throws MalformedURLException {
		 	URL url = new URL(imageURL);
	        Icon icon = new ImageIcon(url);
	        return new JLabel(icon);
	 }
}

