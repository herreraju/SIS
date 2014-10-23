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


public class AddOrDelStudent extends JFrame
{
	static JLabel instrv = new JLabel("          First Name            Last Name             1st Class                           2nd Class                         3rd Class");
	static JButton addDelActCl = new JButton("Enter");
	public static String[] strikstro = new String[]{"A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D"};
	static JTextField firstPName = new JTextField(8);
	static JTextField lastPName = new JTextField(8);
	static JTextField firPName = new JTextField(7);
	public static JComboBox<String> firchoi = new JComboBox<String>(strikstro);
	static JTextField secPName = new JTextField(7);
	public static JComboBox<String> secchoi = new JComboBox<String>(strikstro);
	static JTextField thPName = new JTextField(7);
	public static JComboBox<String> thchoi = new JComboBox<String>(strikstro);
	public static JFrame frameAdd = new JFrame("Add Student");
public static void addStudentToArray()
	{
	frameAdd.setLayout(new BorderLayout());
	frameAdd.setSize(700, 100);
	frameAdd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frameAdd.setResizable(false);
	frameAdd.setLocationRelativeTo(null);
	JPanel addPanel = new JPanel();
	frameAdd.add(instrv, BorderLayout.NORTH);
	addPanel.add(firstPName);
	addPanel.add(lastPName);
	addPanel.add(firPName);
	addPanel.add(firchoi);
	addPanel.add(secPName);
	addPanel.add(secchoi);
	addPanel.add(thPName);
	addPanel.add(thchoi);
	addPanel.add(addDelActCl);
	frameAdd.add(addPanel);
	addDelActCl.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
				{
				String fff1 = firstPName.getText();
				String fff2 = lastPName.getText();
				String fff3 = firPName.getText();
				String fff4 = (String)firchoi.getSelectedItem();
				String fff5 = secPName.getText();
				String fff6 = (String)secchoi.getSelectedItem();
				String fff7 = thPName.getText();
				String fff8 = (String)thchoi.getSelectedItem();
				Student sallyStudent = new Student(fff1, fff2, 0.0, fff3, fff4, fff5, fff6, fff7, fff8);
				sallyStudent.setGPA(ImportTextFile.calculateGPA(sallyStudent));
				ImportTextFile.classArray.add(sallyStudent);
				General.printSIS();
				}
		});
	frameAdd.setVisible(true);
	}
public static void deleteFromArray()
	{
	final int[] ssde = {0};
	ArrayList<String> chStArrL = new ArrayList<String>();
	for (Student hhh : ImportTextFile.classArray) 
		{
		chStArrL.add((hhh.getFirstName() + " " + hhh.getLastName()));
		}
	String[] chStArr = chStArrL.toArray(new String[chStArrL.size()]);
	JButton buttonchoStu = new JButton("Enter");
	final JComboBox<String> dropDownchoStu = new JComboBox<String>(chStArr);
	final JFrame framechoStu = new JFrame("Choose Student");
	framechoStu.setSize(400, 100);
	framechoStu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	framechoStu.setResizable(false);
	framechoStu.setLocationRelativeTo(null); // Sets JPanel to center of screen
	final JPanel panelMain = new JPanel();
	framechoStu.add(panelMain);
	panelMain.add(dropDownchoStu);
	panelMain.add(buttonchoStu);
	framechoStu.setVisible(true);
	buttonchoStu.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
				{
				framechoStu.dispose();
				ssde[0] = dropDownchoStu.getSelectedIndex();
				ImportTextFile.classArray.remove(ssde[0]);
				General.printSIS();
				}
		});
	}
}
