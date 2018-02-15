import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton joke = new JButton ();
	JButton punchline = new JButton();
public static void main(String[] args) {
	ChuckleClicker chuck = new ChuckleClicker();
	chuck.makeButtons();
}

public void makeButtons() {
	
	
	panel.add(joke);
	panel.add(punchline);
	frame.add(panel);
	joke.setText("joke");
	punchline.setText("punchline");
	frame.setVisible(true);
	frame.pack();
	joke.addActionListener(this);
	punchline.addActionListener(this);
	
	
	
	
//Make a ChuckleClicker class, a main method and a makeButtons method. Put a pop-up in the makeButtons method and get it working. You will need to instantiate your class and call method an instance of it. 
//
//Make a JFrame in makeButtons() method and get it to show.
//
//Add a JPanel and two JButtons and get them to show up like this:
//
//*[Optional] Customize your GUI with setText, setSize, etc.
//
//Make a pop-up that says “hi” when either of the buttons are pressed. You will need to add listeners to the buttons for this to work.
//
//Check if the ActionEvent came from the joke button or the punchline button.  
//if(arg0.getSource() == jokeButton)
//You might need to move the declaration of your buttons above the the makeButtons() method.
//
//Use JOptionPane to print the joke or the punchline depending on which button was clicked.
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if(arg0.getSource() == joke) {
	
JOptionPane.showMessageDialog(null, "Why does a chicken coop only have two doors?");
	}else if( arg0.getSource() == punchline){
		JOptionPane.showMessageDialog(null, "If it had four doors, it'd be a chicken sedan.");
	}
}
}