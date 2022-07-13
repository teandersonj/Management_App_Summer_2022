import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame implements ActionListener{

	JMenuBar menuBar;
	JMenu projectMenu;
	JMenu editMenu;
	JMenu helpMenu;
	JMenuItem newItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	JMenuItem loadItem;

	MainFrame(){		

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700,700);
		this.setLayout(new FlowLayout());

		
		//Create Menu Bar
		menuBar = new JMenuBar();
		
		//Create Menu Bar's items
		projectMenu = new JMenu("Project");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");

		//Create functions for projectMenu
		newItem = new JMenuItem("New Project");
		loadItem = new JMenuItem("Load Project");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		//add functions to fileMenu
		projectMenu.add(newItem);
		projectMenu.add(loadItem);
		projectMenu.add(saveItem);
		projectMenu.add(exitItem);
		
		//Add ActionListioner to file's menu functions
		newItem.addActionListener(this);
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);

		
		//Add Menu Bar's items to menuBar
		menuBar.add(projectMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);

		this.setJMenuBar(menuBar);
		
		this.setVisible(true);

	}

	

	@Override

	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == newItem) {

			new_project_menu about = new new_project_menu();
			about.setVisible(true);

		}
		
		if(e.getSource() == loadItem) {
			
			System.out.println("Project Loaded");
		}

		if(e.getSource() == saveItem) {

			System.out.println("Project Saved");

		}

		if(e.getSource() == exitItem) {

			System.exit(0);

		}

	}

}