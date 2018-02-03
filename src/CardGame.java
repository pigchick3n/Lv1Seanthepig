import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CardGame {
public static void main(String[] args) {
	CardGame game = new CardGame();
			game.createUI();
}

private void createUI() {
	// TODO Auto-generated method stub
	JFrame frame = new JFrame();
	JLabel player1 = new JLabel();
	JLabel player2 = new JLabel();
	JButton drawpile = new JButton();
	frame.add(player1);
	frame.add(player2);
	frame.add(drawpile);
}
}
