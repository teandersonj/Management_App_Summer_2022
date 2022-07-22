
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Button;

public class Start extends JFrame implements ActionListener {
	
	JPanel contentPane;
	JTextField textField;
	JPasswordField passwordField;
	JLabel lblNewLabel;
	JLabel lblNewLabel_1;
	JLabel lblNewLabel_2;
	Button button;
	
	Start() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("ProjiTrak");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblNewLabel.setBounds(41, 30, 344, 71);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Username :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(116, 112, 74, 24);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(200, 112, 111, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Password :");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(116, 147, 74, 14);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(200, 143, 111, 20);
		contentPane.add(passwordField);
		
		button = new Button("Submit");
		button.setBounds(171, 184, 70, 22);
		button.addActionListener(this);
		contentPane.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		String user = textField.getText();
//		String password = passwordField.getText();
//		System.out.println(user + ", " + password);
//		
//		if(user.equals("admin") && password.equals("admin")) {
//			dispose();
//			new MainFrame();
//		} else {
//			new Start();
//		}
		if(e.getSource() == button) {
			new MainFrame();
		}
		}
	}