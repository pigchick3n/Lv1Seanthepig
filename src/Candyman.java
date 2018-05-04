import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Candyman implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton("Candyman");
	String scarypic = "https://static.squarespace.com/static/51b3dc8ee4b051b96ceb10de/51ce6099e4b0d911b4489b79/51ce61f9e4b0d911b44a8353/1303420352094/1000w/Bert2mail.jpg"; 
	public static void main(String[] args) {
		Candyman c = new Candyman();
		c.run();
	}
	void run(){
		frame.add(button);
		button.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
	}
	



@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
private void showPictureFromTheInternet(String imageUrl) {
	try {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		JFrame frame = new JFrame();
		frame.add(imageLabel);
		frame.setVisible(true);
		frame.pack();
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
}
}