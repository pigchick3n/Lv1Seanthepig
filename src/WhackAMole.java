import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
JFrame frame = new JFrame(); 
JPanel panel = new JPanel();
Random rand = new Random();
int r = rand.nextInt();
public static void main(String[] args) {
	WhackAMole wak = new WhackAMole();
	wak.drawButtons(1);
}
private void drawButtons(int rand) {
	frame.add(panel);

}
}

