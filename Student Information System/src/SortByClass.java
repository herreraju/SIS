import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class SortByClass
	{
	public static ArrayList<Student> changedArray = new ArrayList<Student>();
	public static void EBA()
		{
		for (Student fgr : ImportTextFile.classArray)
			{
			if (fgr.getP1Class() == "English")
				{
				changedArray.add(fgr);
				}
			
			}
		
		for (Student fhgr :ImportTextFile.classArray)
			{
			if (fhgr.getP1Class() == "Biology")
				{
				changedArray.add(fhgr);
				}
			
			}
		
		for (Student fsgr :ImportTextFile.classArray)
			{
			if (fsgr.getP1Class() == "Algebra")
				{
				changedArray.add(fsgr);
				}
			
			}
		}
	
	public static void EAB()
		{
		for (Student fsggr : ImportTextFile.classArray)
			{
			if (fsggr.getP1Class() == "English")
				{
				changedArray.add(fsggr);
				}
			
			}
		
		for (Student fshgr : ImportTextFile.classArray)
			{
			if (fshgr.getP1Class() == "Algebra")
				{
				changedArray.add(fshgr);
				}
			
			}
		
		for (Student fssgr : ImportTextFile.classArray)
			{
			if (fssgr.getP1Class() == "Biology")
				{
				changedArray.add(fssgr);
				}
			
			}
		}
	
	
	public static void ABE()
		{
		for (Student fgrr : ImportTextFile.classArray)
			{
			if (fgrr.getP1Class() == "Algebra")
				{
				changedArray.add(fgrr);
				}
			
			}
		
		for (Student fhhgr : ImportTextFile.classArray)
			{
			if (fhhgr.getP1Class() == "Biology")
				{
				changedArray.add(fhhgr);
				}
			
			}
		
		for (Student ffsgr : ImportTextFile.classArray)
			{
			if (ffsgr.getP1Class() == "English")
				{
				changedArray.add(ffsgr);
				}
			
			}
		}
	
	public static void AEB()
		{
		for (Student fjsggr : ImportTextFile.classArray)
			{
			if (fjsggr.getP1Class() == "Algebra")
				{
				changedArray.add(fjsggr);
				}
			
			}
		
		for (Student fkshgr : ImportTextFile.classArray)
			{
			if (fkshgr.getP1Class() == "English")
				{
				changedArray.add(fkshgr);
				}
			
			}
		
		for (Student flssgr : ImportTextFile.classArray)
			{
			if (flssgr.getP1Class() == "Biology")
				{
				changedArray.add(flssgr);
				}
			
			}
		}
	
	
	public static void BAE()
		{
		for (Student fegr : ImportTextFile.classArray)
			{
			if (fegr.getP1Class() == "Biology")
				{
				changedArray.add(fegr);
				}
			
			}
		
		for (Student fwhgr : ImportTextFile.classArray)
			{
			if (fwhgr.getP1Class() == "Algebra")
				{
				changedArray.add(fwhgr);
				}
			
			}
		
		for (Student fqsgr : ImportTextFile.classArray)
			{
			if (fqsgr.getP1Class() == "English")
				{
				changedArray.add(fqsgr);
				}
			
			}
		}
	
	public static void BEA()
		{
		for (Student frsggr : ImportTextFile.classArray)
			{
			if (frsggr.getP1Class() == "Biology")
				{
				changedArray.add(frsggr);
				}
			
			}
		
		for (Student ftshgr : ImportTextFile.classArray)
			{
			if (ftshgr.getP1Class() == "English")
				{
				changedArray.add(ftshgr);
				}
			
			}
		
		for (Student fyssgr : ImportTextFile.classArray)
			{
			if (fyssgr.getP1Class() == "Algebra")
				{
				changedArray.add(fyssgr);
				}
			
			}
		}
	
	public static void IntegrateChange()
		{
		ImportTextFile.classArray = changedArray;
		}
	}

