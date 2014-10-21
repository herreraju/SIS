public class Student
	{
	String firstName;
	String lastName;
	double GPA;
	String p1Class;
	String p1Grade;
	String p2Class;
	String p2Grade;
	String p3Class;
	String p3Grade;

	public Student(String fn, String ln, double stg, String p1c, String p1g,
			String p2c, String p2g, String p3c, String p3g)
		{
		firstName = fn;
		lastName = ln;
		GPA = stg;
		p1Class = p1c;
		p1Grade = p1g;
		p2Class = p2c;
		p2Grade = p2g;
		p3Class = p3c;
		p3Grade = p3g;
		}

	public String getFirstName()
		{
		return firstName;
		}

	public String getLastName()
		{
		return lastName;
		}

	public double getGPA()
		{
		return GPA;
		}

	public String getP1Class()
		{
		return p1Class;
		}

	public String getP1Grade()
		{
		return p1Grade;
		}

	public String getP2Class()
		{
		return p2Class;
		}

	public String getP2Grade()
		{
		return p2Grade;
		}

	public String getP3Class()
		{
		return p3Class;
		}

	public String getP3Grade()
		{
		return p3Grade;
		}

	public void setFirstName(String firstName)
		{
		this.firstName = firstName;
		}

	public void setLastName(String lastName)
		{
		this.lastName = lastName;
		}

	public void setGPA(double gPA)
		{
		GPA = gPA;
		}

	public void setP1Class(String p1Class)
		{
		this.p1Class = p1Class;
		}

	public void setP1Grade(String p1Grade)
		{
		this.p1Grade = p1Grade;
		}

	public void setP2Class(String p2Class)
		{
		this.p2Class = p2Class;
		}

	public void setP2Grade(String p2Grade)
		{
		this.p2Grade = p2Grade;
		}

	public void setP3Class(String p3Class)
		{
		this.p3Class = p3Class;
		}

	public void setP3Grade(String p3Grade)
		{
		this.p3Grade = p3Grade;
		}
	}