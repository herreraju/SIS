import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class SortByClass
	{
	public static void chooseClass()
		{
		String[] preMadeArrayForClassChoice = new String[]
					{"Sort by Last Name", "Sort by GPA", "Sort by Class"};
			JButton buttonClassChoice = new JButton("Enter");
			JComboBox<String> dropDownSortStu = new JComboBox<String>(preMadeArrayForClassChoice);
			JFrame frameChooseClass = new JFrame("SortStu Menu");
		}

	}
