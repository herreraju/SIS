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
	int cvintsr = 0;
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
		classArray.add(new Student(ff, ll, 0.0,  "", ci, gi, cii, gii, ciii, giii));
		classArray.get(cvintsr).setGPA(calculateGPA(classArray.get(cvintsr)));
		classArray.get(cvintsr).setGPAst(doubleToStringGPA(calculateGPA(classArray.get(cvintsr))));
		cvintsr++;
		}
	}
public double calculateSingGPA(String stv)
	{
	double slovinv = 0;
	switch(stv) 
		{
		case "A+":
			{
			slovinv = 4.3;
			}
		case "A":
			{
			slovinv = 4.0;
			}
		case "A-":
			{
			slovinv = 3.7;
			}
		case "B+":
			{
			slovinv = 3.3;	
			}
		case "B":
			{
			slovinv = 3.0;
			}
		case "B-":
			{
			slovinv = 2.7;
			}
		case "C+":
			{
			slovinv = 2.3;
			}
		case "C":
			{
			slovinv = 2.0;
			}
		case "C-":
			{
			slovinv = 1.7;
			}
		case "D+":
			{
			slovinv = 1.3;
			}
		case "D":
			{
			slovinv = 1.0;
			}
		case "D-":
			{
			slovinv = 0.7;
			}
		case "F":
			{
			slovinv = 0.0;
			}
		default:
			{	
			}
		}
	return slovinv;
	}
public double calculateGPA(Student stuvf)
	{
	double drdr = calculateSingGPA(stuvf.getP1Grade()) + calculateSingGPA(stuvf.getP2Grade()) + calculateSingGPA(stuvf.getP3Grade());
	drdr = drdr / 3;
	return drdr;
	}
public String doubleToStringGPA(double df)
	{
	df = df * 100.0;
    df = Math.round(df);
    df = df / 100.0;
    String z = Double.toString(df);
    if(z.charAt(z.length() - 2) == '.')
      {
      z = z + "0";
      }
    else
      {
      }
    return z;
	}
}