import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ListenerExample implements ActionListener {
public static void main(String[] args) {
	ListenerExample ex = new ListenerExample();
	ex.run();
}
public void run() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Click me pls");
	frame.add(panel);
	panel.add(button);
	frame.pack();
	frame.setVisible(true);
	button.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("Tada!");
}
}
