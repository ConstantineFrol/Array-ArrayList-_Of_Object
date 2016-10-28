/**
 * 
 */
package Week2_Q3;

import java.util.Scanner;

/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 * GitHub		https://github.com/ConstantineFrol/repositories
 */
public class TestStudentPartB {

	public static void main(String[] args) {

		// Class [Scanner] with [Object] name userInput 
		Scanner userInput = new Scanner(System.in);

		/**
		 * Initialize variables
		 */

		int 	number_of_Students = 0,
				examinationMark = 0,
				count = 0;	// used to count a number of times, when user input was incorrect

		String	firstName = "",
				lastName = "",
				cardinalNumberEnding = "",
				examResult = "";

		// Well it should be at least 20 students,
		// For that I can use [Do - while] to validate number of students like this:
		do{

			// I set a counter to count how many times user input wrong Quantity of students
			count++;

			// if number of count will be bigger than 2, then display useful message to user 
			if(count > 2)
			{
				System.out.println("There must be at least 20 students!");
			}

			// Ask to input number of students
			System.out.println("Enter number of students: ");

			// Display an error until input is correct
			while(!userInput.hasNextInt())
			{
				System.out.println("Oops wrong input! Please enter an integer");
				userInput.next();
			}

			// Set variable to user input
			number_of_Students = userInput.nextInt();

			//TODO  Change after testing back to 20
		}while(number_of_Students < 20);		

		// Creating an Array[studentDetails] of Object [Student]
		Student[] studentDetails = new Student[number_of_Students];

		// Fill up Array of Object with Data that provided by user
		for(int i = 0; i < studentDetails.length; i++)
		{

			studentDetails[i] = new Student();

			switch (i) {
			case 0:  cardinalNumberEnding = "st";
			break;
			case 1:  cardinalNumberEnding = "nd";
			break;
			case 2:  cardinalNumberEnding = "rd";
			break;
			default: cardinalNumberEnding = "th";
			break;
		}

			/**
			 * Ask student first name
			 */

			// I reset the count to 0, so that I can use it again
			count = 0;

			// Keep asking name till length of first name will contains at least 3 characters 
			do{
				// Ask user to input student first name and validate input from user,if input is not what we expected then display an error
				System.out.println("Please enter the first name of the " + (i+1) + cardinalNumberEnding + " student");

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

				studentDetails[i].setStudentFirstName(firstName);

			}while(firstName.length() < 3);

			// I reset the count to 0, so that I can use it again
			count = 0;

			// Keep asking name till length of last name will contains at least 3 characters 
			do{
				// Ask user to input student last name and validate input from user,if input is not what we expected then display an error
				System.out.println("Please enter the last name of the " + (i+1) + cardinalNumberEnding + " student");

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

				studentDetails[i].setStudentLastName(lastName);
			}while(lastName.length() < 3);

			// I reset the count to 0, so that I can use it again
			count = 0;

			/**
			 * Ask student examination mark
			 */

			do{

				// Ask user to input student examination mark and validate input from user,if input is not what we expected then display an error
				System.out.println("Please enter the examination mark of the " + (i+1) + cardinalNumberEnding + " student");

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

				studentDetails[i].setStudentExaminationMark(examinationMark);

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

			studentDetails[i].setExamResult(examResult);

		}

		// Display result on console
		for(int i = 0; i < studentDetails.length; i++)
		{
			System.out.println(studentDetails[i].getStudentFirstName() + " " + studentDetails[i].getStudentLastName() + " received a " + studentDetails[i].getExamResult() + " for his mark of " + studentDetails[i].getStudentExaminationMark());
		}

		// Closing Scanner	
		userInput.close();
	}

}
