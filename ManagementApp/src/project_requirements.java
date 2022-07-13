import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class project_requirements extends JFrame implements ActionListener {
	
	private JPanel contentPane;
	private JButton functionalButton;
	private JButton nonfunctionalButton;
	
	project_requirements() {
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		functionalButton = new JButton("Functional");
		functionalButton.setFont(new Font("Segoe UI", Font.BOLD, 24));
		functionalButton.setBounds(39, 122, 383, 59);
		contentPane.add(functionalButton);
		
		nonfunctionalButton = new JButton("Non-Functional");
		nonfunctionalButton.setFont(new Font("Segoe UI", Font.BOLD, 24));
		nonfunctionalButton.setBounds(39, 216, 383, 59);
		contentPane.add(nonfunctionalButton);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
