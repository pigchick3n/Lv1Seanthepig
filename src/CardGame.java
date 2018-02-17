import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardGame {
public static void main(String[] args) {
	CardGame game = new CardGame();
			game.createUI();
}

private void createUI() {
	// TODO Auto-generated method stub
	String x = "dogehero.jpeg";
	String y = "umalog.jpg";
	int herohealth = 100;
	int enemyhealth = 100;
	JFrame frame = new JFrame();
	JPanel mainpanel = new JPanel();
	JPanel heropanel = new JPanel();
	JPanel enemypanel = new JPanel();
	JPanel attackpanel = new JPanel();
	JLabel enemypic = new JLabel();
	JLabel heropic = new JLabel();
	JLabel herohp = new JLabel("HP:" + herohealth);
	JLabel enemyhp = new JLabel("HP:" + enemyhealth);
	JButton attack = new JButton("Attack!");
	heropic = loadImageFromComputer(x);
	enemypic = loadImageFromComputer(y);
	frame.add(mainpanel);
	mainpanel.add(heropanel);
	mainpanel.add(enemypanel);
	mainpanel.add(attackpanel);
	heropanel.add(heropic);
	heropanel.add(herohp);
	enemypanel.add(enemypic);
	enemypanel.add(enemyhp);
	attackpanel.add(attack);
	frame.pack();
	frame.setVisible(true);

}
public JLabel loadImageFromComputer(String fileName) {
	URL imageURL = getClass().getResource(fileName);
	Icon icon = new ImageIcon(imageURL);
	return new JLabel(icon);
}

}
