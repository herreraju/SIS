import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class changeGrade
{
	public static ArrayList<Student> classArray = new ArrayList<Student>();
	static String selectStudent;
	static String selectClass;

	//Replace the original grade with the user input
public static void chasStudent(final int i)
	{
	final int[] ssde = {0};
	ArrayList<String> chStArrL = new ArrayList<String>();
	for (Student hhh : ImportTextFile.classArray) 
		{
		chStArrL.add((hhh.getFirstName() + " " + hhh.getLastName()));
		}
	String[] chStArr = chStArrL.toArray(new String[chStArrL.size()]);
	JButton buttonchaSt = new JButton("Enter");
	final JComboBox<String> dropDownchaSt = new JComboBox<String>(chStArr);
	final JFrame framechaSt = new JFrame("Choose Student");
	framechaSt.setSize(400, 100);
	framechaSt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	framechaSt.setResizable(false);
	framechaSt.setLocationRelativeTo(null); // Sets JPanel to center of screen
	final JPanel panelMain = new JPanel();
	framechaSt.add(panelMain);
	panelMain.add(dropDownchaSt);
	panelMain.add(buttonchaSt);
	framechaSt.setVisible(true);
	buttonchaSt.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
				{
				framechaSt.dispose();
				ssde[0] = dropDownchaSt.getSelectedIndex();
				switch (i)
					{
					case 0:
						{
						changueGrade(ssde[0]);
						break;
						}
					case 1:
						{
						changeSchedule.changueSched(ssde[0]);
						break;
						}
					}
				}
			
		});
	
	}
public static void changueGrade(final int sg)
	{
	String [] chStArr = new String[] {"A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "F"};
	final JComboBox<String> dropDownchanGr = new JComboBox<String>(chStArr);
	String [] chStArrW = new String[] {"Period 1", "Period 2", "Period 3"};
	final JComboBox<String> dropDownchanGrW = new JComboBox<String>(chStArrW);
	JButton buttonchanGr = new JButton("Enter"); 
	final JFrame framechanGr = new JFrame("Change Grade for Period");
	framechanGr.setSize(400, 100);
	framechanGr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	framechanGr.setResizable(false);
	framechanGr.setLocationRelativeTo(null); // Sets JPanel to center of screen
	final JPanel panelCh = new JPanel();
	panelCh.add(dropDownchanGr);
	panelCh.add(dropDownchanGrW);
	panelCh.add(buttonchanGr);
	framechanGr.add(panelCh);
	buttonchanGr.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
				{
				framechanGr.dispose();
				int ssswk = dropDownchanGrW.getSelectedIndex();
				switch (ssswk)
					{
					case 0:
						{
						ImportTextFile.classArray.get(sg).setP1Grade((String)dropDownchanGr.getSelectedItem());
						ImportTextFile.classArray.get(sg).setGPA(ImportTextFile.calculateGPA(ImportTextFile.classArray.get(sg)));
						General.printSIS();
						break;
						}
					case 1:
						{
						ImportTextFile.classArray.get(sg).setP2Grade((String)dropDownchanGr.getSelectedItem());
						ImportTextFile.classArray.get(sg).setGPA(ImportTextFile.calculateGPA(ImportTextFile.classArray.get(sg)));
						General.printSIS();
						break;
						}
					case 2:
						{
						ImportTextFile.classArray.get(sg).setP3Grade((String)dropDownchanGr.getSelectedItem());
						ImportTextFile.classArray.get(sg).setGPA(ImportTextFile.calculateGPA(ImportTextFile.classArray.get(sg)));
						General.printSIS();
						break;
						}
					}
				}
			
		});
	framechanGr.setVisible(true);
	}
}