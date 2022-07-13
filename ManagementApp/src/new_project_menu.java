import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class new_project_menu extends JFrame implements ActionListener {
	
	private JPanel contentPane;
	private JButton aboutButton;
	private JLabel lblNewLabel;
	private JButton prj_req_bttn;
	private JButton prjmngbttn;
	
	new_project_menu() {
		
		//Frame Settings
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Title
		lblNewLabel = new JLabel("New Project");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 26));
		lblNewLabel.setBounds(134, 36, 209, 59);
		contentPane.add(lblNewLabel);
		
		//About Button
		aboutButton = new JButton("About");
		aboutButton.setFont(new Font("Segoe UI", Font.BOLD, 24));
		aboutButton.setBounds(39, 122, 383, 59);
		contentPane.add(aboutButton);
		aboutButton.addActionListener(this);
		
		//Project Requirements Button
		prj_req_bttn = new JButton("Project Requirements");
		prj_req_bttn.setFont(new Font("Segoe UI", Font.BOLD, 24));
		prj_req_bttn.setBounds(39, 216, 383, 59);
		contentPane.add(prj_req_bttn);
		prj_req_bttn.addActionListener(this);
		
		//Project Management Button
		prjmngbttn = new JButton("Project Management");
		prjmngbttn.setFont(new Font("Segoe UI", Font.BOLD, 24));
		prjmngbttn.setBounds(39, 322, 383, 59);
		contentPane.add(prjmngbttn);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//when About Button is clicked
		if(e.getSource()==aboutButton) {
			About about = new About();
			about.setVisible(true);
		}
		
		//when Project Requirements Button is clicked
		if(e.getSource() == prj_req_bttn) {
			project_requirements prj = new project_requirements();
			prj.setVisible(true);
		}
		
	}
}
