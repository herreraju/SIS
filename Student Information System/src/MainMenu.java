import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainMenu
	{
	public static String[] preMadeArrayForMain = new String[]
				{ "Add or Delete a Student", "Change Student Grades/Schedule", "Sort Students" };
	static JButton buttonMainm = new JButton("Enter");
	public static JComboBox<String> dropDownForMain = new JComboBox<String>(preMadeArrayForMain);
	public static JFrame frameMain = new JFrame("Main Menu");
	public static String[] preMadeArrayForAddDel = new String[]
				{ "Add a Student", "Delete a Student"};
	static JButton buttonAddDel = new JButton("Enter");
	public static JComboBox<String> dropDownAddDel = new JComboBox<String>(preMadeArrayForAddDel);
	public static JFrame frameAddDel = new JFrame("Add or Delete");
	public static void displayMainMethod()
		{
		frameMain.setSize(400, 100);
		frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMain.setResizable(false);
		frameMain.setLocationRelativeTo(null); // Sets JPanel to center of screen
		final JPanel panelMain = new JPanel();
		frameMain.add(panelMain);
		panelMain.add(dropDownForMain);
		panelMain.add(buttonMainm);
		buttonMainm.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
					{
					int mainChoice = dropDownForMain.getSelectedIndex();
					frameMain.dispose();
					switch (mainChoice)
						{
						case 0:
							{
							displayAddDel();
							}
						case 1:
							{
							
							}
						case 2:
							{
							
							}
						}
					}
			});
		frameMain.setVisible(true);
		}
	public static void displayAddDel()
		{
		frameAddDel.setSize(400, 100);
		frameAddDel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameAddDel.setResizable(false);
		frameAddDel.setLocationRelativeTo(null); // Sets JPanel to center of screen
		final JPanel panelAddDel = new JPanel();
		frameAddDel.add(panelAddDel);
		panelAddDel.add(dropDownAddDel);
		panelAddDel.add(buttonAddDel);
		buttonAddDel.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
					{
					int addDellChoice = dropDownAddDel.getSelectedIndex();
					frameAddDel.dispose();
					switch (addDellChoice)
						{
						case 0:
							{
							}
						case 1:
							{
							}
						}
					}
			});
		frameAddDel.setVisible(true);
		}
	}
