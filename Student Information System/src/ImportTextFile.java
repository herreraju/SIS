import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class ImportTextFile
{
public ArrayList<Student> classArray = new ArrayList<Student>();
private Scanner file;
public void addClasses()
	{
	try
		{
		file = new Scanner(new File("studentList.txt"));
		} catch (FileNotFoundException e)
		{
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	while(file.hasNext())
		{
		String ff = file.next();
		String ll = file.next();
		String ci = file.next();
		String gi = file.next();
		String cii = file.next();
		String gii = file.next();
		String ciii = file.next();
		String giii = file.next();
		classArray.add(new Student(ff, ll, 0.0, ci, gi, cii, gii, ciii, giii));
		}
	}
public double calculateGPA(Student stuvf)
	{
	return 1.1;
	}
}