import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class About extends JFrame implements ActionListener {
	private JPanel contentPane;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JButton btnTeamMembers;
	private JButton btnRiskAndRisk;
	
	About() {
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("Description");
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 24));
		btnNewButton.setBounds(39, 122, 383, 59);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("About");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 26));
		lblNewLabel.setBounds(134, 36, 209, 59);
		contentPane.add(lblNewLabel);
		
		btnTeamMembers = new JButton("Team Members");
		btnTeamMembers.setFont(new Font("Segoe UI", Font.BOLD, 24));
		btnTeamMembers.setBounds(39, 216, 383, 59);
		contentPane.add(btnTeamMembers);
		
		btnRiskAndRisk = new JButton("Risk and Risk Status");
		btnRiskAndRisk.setFont(new Font("Segoe UI", Font.BOLD, 24));
		btnRiskAndRisk.setBounds(39, 322, 383, 59);
		contentPane.add(btnRiskAndRisk);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}