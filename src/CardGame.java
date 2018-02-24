import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CardGame implements ActionListener {
	
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
public static void main(String[] args) {
	CardGame game = new CardGame();
			game.createUI();
}

private void createUI() {
	// TODO Auto-generated method stub

	heropic = loadImageFromComputer(x);
	enemypic = loadImageFromComputer(y);
	frame.add(mainpanel);
	frame.setLayout(new GridLayout(2,2));
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
	attack.addActionListener(this);
	
}
public JLabel loadImageFromComputer(String fileName) {
	URL imageURL = getClass().getResource(fileName);
	Icon icon = new ImageIcon(imageURL);
	return new JLabel(icon);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	Random r = new Random();
	int damage = r.nextInt(20);
	herohealth -= damage;
	Random r2 = new Random();
	int damage2 = r2.nextInt(20);
	enemyhealth -= damage2;
	herohp.setText("" +herohealth);
	enemyhp.setText("" +enemyhealth);
	if(herohealth <= 0) {
		JOptionPane.showMessageDialog(null, "You Much Horrible Dead");
	herohp.setText("Dead");
	attackpanel.remove(attack);
	}	
	if(enemyhealth <= 0) {
		JOptionPane.showMessageDialog(null, "Enemy Much Horrible Dead");
		enemyhp.setText("Dead");
		attackpanel.remove(attack);
	}	
	
			
}

}
