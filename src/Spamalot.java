import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalot implements ActionListener {
	static final String FAKE_USERNAME = "uoummsmtgtrollsalt";
	static final String FAKE_PASSWORD = "pAsSw0rD";
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField textfield = new JTextField(20);
	JButton bad = new JButton("Bad");
	JButton good = new JButton("Good");
	public static void main(String[] args) {
		Spamalot s = new Spamalot();
		s.run();
	}
	public void run() {
		frame.add(panel);
		panel.add(textfield);
		panel.add(bad);
		panel.add(good);
		bad.addActionListener(this);
		good.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("This works!");
	}
	
}
