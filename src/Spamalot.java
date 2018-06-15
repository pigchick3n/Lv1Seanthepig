import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalot implements ActionListener {
	static final String FAKE_USERNAME = "noummsmtgtrollsalt@gmail.com";
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
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == good) {
			String input = textfield.getText();
			for(int i = 0; i<5; i++) {
		sendSpam(input, "Hi", "Hello");
			}
		}else if(buttonPressed == bad) {
			String input = textfield.getText();
			for(int i = 0; i<10; i++) {
			sendSpam(input, "this is bad", "bad stuff");
		}
		}
	}
	 
	private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			textfield.setBackground(Color.GREEN);
			return true;

		} catch (MessagingException e) {
			e.printStackTrace();
			textfield.setBackground(Color.RED);
			return false;
		}
		}
	String sendTextMessage(String phoneNumber, String message){
		if(sendSpam(phoneNumber + "@tmomail.net", "", message)) return "T-Mobile"; 
		if(sendSpam(phoneNumber + "@vmobl.com", "", message)) return "Virgin Mobile"; 
		if(sendSpam(phoneNumber + "@cingularme.com", "", message)) return "Cingular"; 
		if(sendSpam(phoneNumber + "@messaging.sprintpcs.com", "", message)) return "Sprint"; 
		if(sendSpam(phoneNumber + "@vtext.com", "", message)) return "Verizon"; 
		if(sendSpam(phoneNumber + "@messaging.nextel.com", "", message)) return "Nextel"; 
		return "FAIL!";
	}

	}


