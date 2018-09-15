import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PracticeTest implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel riddle = new JLabel();
	JTextField answer = new JTextField(); 
	JButton submit = new JButton("Submit");
	JButton hint = new JButton("Hint");
public static void main(String[] args) {
	PracticeTest pt = new PracticeTest();
	pt.run();
}
void run(){
	frame.add(panel);
	panel.add(riddle);
	panel.add(answer);
	panel.add(submit);
	panel.add(hint);
	submit.addActionListener(this);
	hint.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	JButton buttonPressed = (JButton) e.getSource();
	
	
}

}

