package Week2_Q3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 * GitHub		https://github.com/ConstantineFrol/repositories
 */
public class TestStudentPartC {

	//-------------------------------//
	//    Class/Static Variables     //
	//-------------------------------//

	public static int studentNo = 0;
	public static int studentPosition = 0;
	public static int examinationMark;
	public static String firstName;
	public static String lastName;
	public static String examResult;
	// An ArrayList of the class Student.java
	public static ArrayList<Student> studentList = new ArrayList<Student>();

	public static void main(String[] args) {

		// Creating Scanner
		Scanner userInput = new Scanner(System.in);

		//-------------------------------//
		//       Instance  Variables     //
		//-------------------------------//

		int userChoise = 0;
		Student objectOfStudentClass = null;

		/*
		 * Display menu in console and ask to choose one option [ + validate input ]
		 */

		do
		{

			System.out.println("\n\t*--------------- Menu ---------------*");
			System.out.println("\n\t\tPlease select From Menu\n");
			System.out.println("\t1. ADD NEW Student");
			System.out.println("\t2. Remove Student");
			System.out.println("\t3. List Students");
			System.out.println("\t4. Quit");
			System.out.println("\t5. Help");

			System.out.print("\n\tInput number >"); 
			// Display an error until input is correct
			while(!userInput.hasNextInt())
			{
				System.out.println("Oops wrong input! Please enter an integer");
				userInput.next();
			}
			userChoise = userInput.nextInt();

			// Depends on user choice using switch calling needed method
			switch(userChoise)
			{
			case 1: objectOfStudentClass=addNewStudentIntoList(userInput);
			break;
			case 2:  removeStudentFromList(userInput,objectOfStudentClass);
			break;
			case 3:  ListOutAllSudents();
			break;
			case 4:  System.out.println("\n\tBye Bye !!!");
			break;
			case 5:  System.out.println("\n\tPress ][1][ on your keyboard to add new student");
			System.out.println("\tPress ][2][ on your keyboard to remove specific student");
			System.out.println("\tPress ][3][ on your keyboard to list out all students");
			System.out.println("\tPress ][4][ on your keyboard to quit");
			break;
			default: System.out.println("\n\tOops ,Wrong input !!!\n\tPlease input (1 - 4)");
			break;
			}

		}while(userChoise != 4);


		userInput.close();
	}

	//-------------------//
	//      Methods      //	
	//-------------------//

	/*
	 * Display all students from ArrayList
	 */
	private static void ListOutAllSudents()
	{
		if(studentList.size() == 0)
		{
			System.out.println("\n\tSorry,but the list is empty\n\tPlease add new student");
		}
		else
		{
			for (int i = 0; i < studentList.size(); i++)
			{
				Student listOfStudents = studentList.get(i);
				System.out.println(listOfStudents);
			}
		}
	}

	/*
	 * Removing student that specified by user
	 */
	/**
	 * @param userInput ------------ Scanner - Using to prompt name of student that need to be removed
	 * @param objectOfStudentClass - Object -- I need that for some testing
	 */
	private static void removeStudentFromList(Scanner userInput, Student objectOfStudentClass)
	{
		//-------------------------------//
		//       Local  Variables        //
		//-------------------------------//

		String studentName = "";
		int count = 0;

		/*
		 * Prompt student name
		 */

		// Keep asking name till length of first name will contains at least 3 characters 
		do{
			// Ask user to input student first name and validate input from user,if input is not what we expected then display an error
			System.out.println("Please enter the first name of the student");

			// And again I am using it to display a hint to user where he went wrong
			count++;

			// If user fail entering data 2 times , on console will be displayed this: 
			if(count > 2)
			{
				System.out.println("There must be at least 3 characters !");
			}

			// Well if user enters a digit(whole number or double) he will see an error
			while(userInput.hasNextInt() || userInput.hasNextDouble())
			{
				System.out.println("Oops wrong input! Please try again");
				userInput.next();
			}

			// initialize first name with user input
			studentName = userInput.next();

		}while(studentName.length() < 3);

		/*
		 * Find student name and remove it from Array List
		 */

		for(int i =0;i < studentList.size(); i++)
		{
			if(!studentList.get(i).getStudentFirstName().toUpperCase().contains(studentName.toUpperCase()))
			{
				System.out.println("There is no such student !!!");
			}
			if(studentList.get(i).getStudentFirstName().toUpperCase().contains(studentName.toUpperCase()))
			{
				studentList.remove(i);
				System.out.println("\n\tstudent " + studentName.toUpperCase().charAt(0) + studentName.toLowerCase().substring(1) + " has been removed");
			}
		}
	}

	/*
	 * Adding new student in to ArrayList of the Student class
	 */
	/**
	 * @param userInput - Scanner - used to prompt student details
	 * @return object - need that for testing code
	 */
	private static Student addNewStudentIntoList(Scanner userInput)
	{
		// Object of the class Student.java
		Student studentDetails = new Student();

		/*
		 * Prompt student details [+ validation]
		 */

		int count = 0;
		// Keep asking name till length of first name will contains at least 3 characters 
		do{
			// Ask user to input student first name and validate input from user,if input is not what we expected then display an error
			System.out.println("Please enter the first name of the student");

			// And again I am using it to display a hint to user where he went wrong
			count++;

			// If user fail entering data 2 times , on console will be displayed this: 
			if(count > 2)
			{
				System.out.println("There must be at least 3 characters !");
			}

			// Well if user enters a digit(whole number or double) he will see an error
			while(userInput.hasNextInt() || userInput.hasNextDouble())
			{
				System.out.println("Oops wrong input! Please try again");
				userInput.next();
			}

			// initialize first name with user input
			firstName = userInput.next();

			studentDetails.setStudentFirstName(firstName);

		}while(firstName.length() < 3);

		// I reset the count to 0, so that I can use it again
		count = 0;


		// Keep asking name till length of last name will contains at least 3 characters 
		do{
			// Ask user to input student last name and validate input from user,if input is not what we expected then display an error
			System.out.println("Please enter the last name of the student");

			// And again I am using it to display a hint to user where he went wrong
			count++;

			// If user fail entering data 2 times , on console will be displayed this: 
			if(count > 2)
			{
				System.out.println("There must be at least 3 characters !");
			}

			// Well if user enters a digit(whole number or double) he will see an error
			while(userInput.hasNextInt() || userInput.hasNextDouble())
			{
				System.out.println("Oops wrong input! Please try again");
				userInput.next();
			}

			// initialize last name with user input
			lastName = userInput.next();

			studentDetails.setStudentLastName(lastName);

		}while(lastName.length() < 3);

		do{

			// Ask user to input student examination mark and validate input from user,if input is not what we expected then display an error
			System.out.println("Please enter the examination mark of the student");

			// Count how many times user input wrong value
			count++;

			// When user input 2 times incorrect value he will see a hint
			if(count > 2)
			{
				System.out.println("examination number must be in range 0 - 100");
				userInput.next();
			}

			while(!userInput.hasNextInt())
			{
				System.out.println("Oops wrong input!\nPlease enter a  whole number");
				userInput.next();
			}

			// Set examinationMark of current student to user input
			examinationMark = userInput.nextInt();

			studentDetails.setStudentExaminationMark(examinationMark);

		}while(examinationMark < 0 || examinationMark > 100);


		// This is the grades table that was given, so depends on user input each student examResult will assign 1 out of 4 grades
		if(examinationMark >= 85 && examinationMark <= 100)
		{
			examResult="distinction";
		}
		else if(examinationMark >= 65 && examinationMark <= 84)
		{
			examResult = "merit";
		}
		else if(examinationMark >= 40 && examinationMark <= 64)
		{
			examResult = "pass";
		}
		else if(examinationMark >= 0 && examinationMark <= 39)
		{
			examResult = "fail";
		}

		studentDetails.setExamResult(examResult);

		// Adding all details to the ArrayList of the class Student.java
		studentList.add(studentDetails);

		return studentDetails;

	}



}
