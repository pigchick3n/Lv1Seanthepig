import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingExample {
public static void main(String[] args) {
	//Make components
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Hello, I am Doge.");
	JLabel label = new JLabel();
	//Add them together
	frame.add(panel);
	panel.add(button);
	panel.add(label);
	//Pack the frame
	frame.pack();
	label.setText("Hey, I'm in your label!");
	//Set visible
	frame.setVisible(true);
}
}
