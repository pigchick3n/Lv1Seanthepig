import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton vid1 = new JButton("Video 1");
	JButton vid2 = new JButton("Video 2");
	JButton vid3 = new JButton("Video 3");

	public static void main(String[] args) {
		CutenessTV ctv = new CutenessTV();
		ctv.run();
	}
	public void run(){
		frame.add(panel);
		panel.add(vid1);
		panel.add(vid2);
		panel.add(vid3);
		frame.setVisible(true);
		frame.pack();
		vid1.addActionListener(this);
		vid2.addActionListener(this);
		vid3.addActionListener(this);
	}
void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}
	
	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
	URI uri = new URI("https://www.youtube.com/watch?v=" + videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed==vid1) {
			showDucks();
		}else if(buttonPressed==vid2) {
			showFrog();
		}else if(buttonPressed==vid3){
			showFluffyUnicorns();
		}
		
	}

}









