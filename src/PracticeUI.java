import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PracticeUI implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton yo = new JButton("Yo!");
	JButton cya = new JButton("Cya!");

	public static void main(String[] args) {
		PracticeUI gui = new PracticeUI();
		gui.run();
	}

	public void run() {
		frame.add(panel);
		panel.add(yo);
		panel.add(cya);
		yo.addActionListener(this);
		cya.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == yo) {
			System.out.println("Yo!");
		}
		if (buttonPressed == cya) {
			System.out.println("Cya!");
		}
	}
}
