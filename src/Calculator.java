import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
JFrame frame = new JFrame("Calculator");
JPanel panel = new JPanel();
JTextField first = new JTextField(20);
JTextField second = new JTextField(20);
JButton add = new JButton("+");
JButton subtract = new JButton("-");
JButton multiply = new JButton("*");
JButton divide = new JButton("/");
JLabel ans = new JLabel();


public static void main(String[] args) {
	Calculator c = new Calculator();
	c.calculate();
}
public void calculate(){
	frame.add(panel);
	panel.add(first);
	panel.add(second);
	panel.add(subtract);
	panel.add(add);
	panel.add(multiply);
	panel.add(divide);
	panel.add(ans);
	add.addActionListener(this);
	subtract.addActionListener(this);
	multiply.addActionListener(this);
	divide.addActionListener(this);
	frame.pack();
	frame.setVisible(true);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	String f = first.getText();
	int firstone = Integer.parseInt(f);
	String s = first.getText();
	int secondone = Integer.parseInt(s);
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed == add) {
	int answer = firstone + secondone;
	ans.setText(String.valueOf(answer));

}else if(buttonPressed == subtract) {
	int answer = firstone - secondone;
	ans.setText(String.valueOf(answer));
	
}else if(buttonPressed == multiply) {
	int answer = firstone * secondone;
	System.out.println(answer);
	ans.setText(String.valueOf(answer));
}else if(buttonPressed == divide) {
	int answer = firstone / secondone;
	ans.setText(String.valueOf(answer));
}
}
}
