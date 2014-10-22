import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class General extends JFrame
{
public static ArrayList<StudentPrint> classPrintArray = new ArrayList<StudentPrint>();
public static void printSIS()
	{
	for (Student zr : ImportTextFile.classArray) 
		{
		classPrintArray.add(new StudentPrint(zr.getFirstName(), zr.getLastName(), ImportTextFile.doubleToStringGPA(zr.getGPA()), zr.getP1Class(), zr.getP1Grade(), zr.getP2Class(), zr.getP2Grade(), zr.getP3Class(), zr.getP3Grade()));
		}
	String[] columnNames = {"First Name", "Last Name", "GPA", "Period 1", "Grade 1", "Period 2", "Grade 2", "Period 3", "Grade 3"};
	DefaultTableModel model = new DefaultTableModel(columnNames, 0);
	JTable studentListChart = new JTable(model);
	for (StudentPrint zrzr: classPrintArray) 
		{
		Object[] objs = {zrzr.getFirstNamew(), zrzr.getLastNamew(), zrzr.getGPAstrw(), zrzr.getP1Classw(), zrzr.getP1Gradew(), zrzr.getP2Classw(), zrzr.getP2Gradew(), zrzr.getP3Classw(), zrzr.getP3Gradew()};
		model.addRow(objs);
		}
	JScrollPane scroll = new JScrollPane(studentListChart);
	studentListChart.setFillsViewportHeight(true);
	JFrame frameForStudentInfo = new JFrame("Student Info");
	frameForStudentInfo.setSize(620, 415);
	frameForStudentInfo.setLayout(new BorderLayout());
	frameForStudentInfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frameForStudentInfo.add(scroll);
	frameForStudentInfo.setResizable(false);
	frameForStudentInfo.setLocationRelativeTo(null);
	frameForStudentInfo.setVisible(true);
	}
public static void main(String[] args) 
	{
	ImportTextFile.addClasses();
	printSIS();
	}
}