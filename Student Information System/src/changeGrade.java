import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class changeGrade
	{
	static String selectStudent;
	static String selectClass;

	//Call the file
	
	//l
	//Replace the original grade with the user input
public static void GradeChange()
	{
	System.out.println("Please Select the Student who's grade you want to Change.");
	//Print out file
	Scanner userInput = new Scanner(System.in);
	selectStudent = userInput.nextLine();
	//Display student's classes
	//Select class
	System.out.println("For what class?");
	Scanner userInput1 = new Scanner(System.in);
	selectClass = userInput.nextLine();
	//Display changed Class grades 
	}
	}
