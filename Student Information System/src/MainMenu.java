import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.util.Collections;

public class MainMenu
	{
	public static String[] preMadeArrayForMain = new String[] { "Add or Delete a Student", "Change Student Grades/Schedule", "Sort Students" };
	static JButton buttonMainm = new JButton("Enter");
	public static JComboBox<String> dropDownForMain = new JComboBox<String>(preMadeArrayForMain);
	public static JFrame frameMain = new JFrame("Main Menu");
	
	public static String[] preMadeArrayForAddDel = new String[]
				{ "Add a Student", "Delete a Student"};
	static JButton buttonAddDel = new JButton("Enter");
	public static JComboBox<String> dropDownAddDel = new JComboBox<String>(preMadeArrayForAddDel);
	public static JFrame frameAddDel = new JFrame("Add or Delete");
	
	public static String[] preMadeArrayForGradSched = new String[]
			{ "Change Grade", "Change Schedule"};
	static JButton buttonGradSched = new JButton("Enter");
	public static JComboBox<String> dropDownForGradSched = new JComboBox<String>(preMadeArrayForGradSched);
	public static JFrame frameGradSched = new JFrame("Change Grades/Schedule");
	
	public static String[] preMadeArrayForSortStu = new String[]
			{"Sort by Last Name", "Sort by GPA", "Sort by Class"};
	static JButton buttonSortStu = new JButton("Enter");
	public static JComboBox<String> dropDownSortStu = new JComboBox<String>(preMadeArrayForSortStu);
	public static JFrame frameSortStu = new JFrame("SortStu Menu");
	
	public static String[] preMadeArrayForClassChoice = new String[]
				{"English, Biology, Algebra", "English, Algebra, Biology", "Algebra, Biology, English", "Algebra, English, Biology", "Biology, Algebra, English", "Biology, English, Algebra"};
	static JButton buttonClassChoice = new JButton("Enter");
	public static JComboBox<String> dropDownClassChoice = new JComboBox<String>(preMadeArrayForClassChoice);
	public static JFrame frameClassChoice = new JFrame("Choose Class Menu");
	
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
							break;
							}
						case 1:
							{
							displayGradSched();
							break;
							}
						case 2:
							{
							displaySortStu();
							break;
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
							AddOrDelStudent.addStudentToArray();
							break;
							}
						case 1:
							{
							AddOrDelStudent.deleteFromArray();
							break;
							}
						}
					}
			});
		frameAddDel.setVisible(true);
		}
	public static void displayGradSched()
	{
	frameGradSched.setSize(400, 100);
	frameGradSched.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frameGradSched.setResizable(false);
	frameGradSched.setLocationRelativeTo(null); // Sets JPanel to center of screen
	final JPanel panelGradSched = new JPanel();
	frameGradSched.add(panelGradSched);
	panelGradSched.add(dropDownForGradSched);
	panelGradSched.add(buttonGradSched);
	buttonGradSched.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
				{
				int GradSchedChoice = dropDownForGradSched.getSelectedIndex();
				frameGradSched.dispose();
				switch (GradSchedChoice)
					{
					case 0:
						{
						changeGrade.chasStudent(GradSchedChoice);
						break;
						}
					case 1:
						{
						changeGrade.chasStudent(GradSchedChoice);
						break;
						}
					}
				}
		});
	frameGradSched.setVisible(true);
	}
	public static void displaySortStu()
	{
	frameSortStu.setSize(400, 100);
	frameSortStu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frameSortStu.setResizable(false);
	frameSortStu.setLocationRelativeTo(null); // Sets JPanel to center of screen
	final JPanel panelSortStu = new JPanel();
	frameSortStu.add(panelSortStu);
	panelSortStu.add(dropDownSortStu);
	panelSortStu.add(buttonSortStu);
	buttonSortStu.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
				{
				int SortStuChoice = dropDownSortStu.getSelectedIndex();
				frameSortStu.dispose();
				switch (SortStuChoice)
					{
					case 0:
						{
						Collections.sort(ImportTextFile.classArray, new LastNameSorter());
						General.printSIS();
						break;
						}
					case 1:
						{
						Collections.sort(ImportTextFile.classArray, new GPASorter());
						General.printSIS();
						break;
						}
					case 2:
						{
						Collections.sort(ImportTextFile.classArray, new LastNameSorter());
						displayClassChoice();
						break;
						}
					}
				}
		});
	frameSortStu.setVisible(true);
	}
	public static void displayClassChoice()
		{
		frameClassChoice.setSize(400, 100);
		frameClassChoice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameClassChoice.setResizable(false);
		frameClassChoice.setLocationRelativeTo(null); // Sets JPanel to center of screen
		final JPanel panelClassChoice = new JPanel();
		frameClassChoice.add(panelClassChoice);
		panelClassChoice.add(dropDownClassChoice);
		panelClassChoice.add(buttonClassChoice);
		buttonClassChoice.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent arg0)
				{
				int SortClassChoice = dropDownClassChoice.getSelectedIndex();
				frameClassChoice.dispose();
				switch(SortClassChoice)
				{
				case 0:
					{
					SortByClass.EBA();
					SortByClass.IntegrateChange();
					break;
					}
				case 1:
					{
					SortByClass.EAB();
					SortByClass.IntegrateChange();
					break;
					}
				case 2:
					{
					SortByClass.ABE();
					SortByClass.IntegrateChange();
					break;
					}
				case 3:
					{
					SortByClass.AEB();
					SortByClass.IntegrateChange();
					break;
					}
				case 4:
					{
					SortByClass.BAE();
					SortByClass.IntegrateChange();
					break;
					}
				case 5:
					{
					SortByClass.BEA();
					SortByClass.IntegrateChange();
					break;
					}
				}
			}
		});
		frameClassChoice.setVisible(true);
	}
}