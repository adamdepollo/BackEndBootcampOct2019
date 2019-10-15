package co.grandcircus;

import java.util.Scanner;

public class ControlStatements {
	public static void main(String[] args) {
		/*
		 * Boolean expressions evaluate to 'true' or to 'false.' They use logical
		 * comparisons like ==, &&, ||, !=, etc. isValid -- assumes it is equal to
		 * 'true' !isValid -- assumes it is equal to 'false || - returns a true value if
		 * either expression is true, only evaluates the second expression if the first
		 * one is not true | - returns a true if either expression is true, evaluates
		 * both expressions
		 */
		
		//Declare variables and create scanner

		Scanner scnr = new Scanner(System.in);

		String grade = "";

		String cont = "y";
		
		//Create a while loop to re-run the program if the user chooses to continue

		while (cont.equalsIgnoreCase("y")) {
			
			//Prompt the user to enter a percentage

			System.out.println("Enter the grade percentage:");

			double gradePercentage = scnr.nextDouble();

			//Clear the scanner
			scnr.nextLine();
			
			//Determine whether the entry was valid
			if (gradePercentage > 100 || gradePercentage < 0) {
				System.out.println("Error: Grade entered not between 0 and 100.");
			}

			else {
				
				//Determine the letter grade based on the percentage entered
				
				if (gradePercentage >= 85.0) {
					grade = "A";
				}

				else if (gradePercentage < 85 && gradePercentage >= 71) {
					grade = "B";
				}

				else if (gradePercentage < 71 && gradePercentage >= 61) {
					grade = "C";
				}

				else if (gradePercentage < 61 && gradePercentage >= 51) {
					grade = "D";
				}

				else if (gradePercentage < 51) {
					grade = "F";
				}
				
				//Print the letter grade
				System.out.println("The letter grade is: " + grade);

				System.out.println();
				
				//Ask the user whether they want to continue
				System.out.println("Continue? (y/n)");

				cont = scnr.nextLine();
			}

		}
		
		//close the scanner
		scnr.close();

	}

}
