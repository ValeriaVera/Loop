import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Frame extends JFrame{
	public static void main(String args[]){
		Frame fram = new Frame ();
		((JFrame) fram).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fram.setSize(500, 300);
		fram.setVisible(true);
		fram.setResizable(false);
	}

	private JButton login;
	private JTextField user;
	private JPasswordField pass;
	
	public Frame(){
	super("Login System");
	setLayout (new FlowLayout () );
	
	user = new JTextField(15);
	add(user);
	pass = new JPasswordField(15);
	add(pass);
	login = new JButton("Login");
	add(login);
	login.addActionListener(new ButtonListener());
	}
	public class ButtonListener implements ActionListener {
		@SuppressWarnings("deprecation")
		public void actionPerformed(ActionEvent e) {
		if (user.getText () .trim() .length() == 0 || pass.getText() .length() == 0){
			JOptionPane.showMessageDialog(null,  "Please enter both textboxes");
		}else{
		if(user.getText().equals("Valeria") || user.getText().equals("Valeria")){
			JOptionPane.showMessageDialog(null,  " Welcome User!");
		}else{
			JOptionPane.showMessageDialog(null, "Wrong Username or Password");
		}
		}
		}
}
}