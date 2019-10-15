/*
 * @Adam DePollo, 10/15/19
 */
package co.grandcircus;

import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) {
		// Declare variables and create scanner
		int userEntry;
		String userName;
		String cont = "y";
		Scanner scnr = new Scanner(System.in);

		//Ask the user for their name
		System.out.println("Hi! What's your name?");
		userName = scnr.nextLine();
		
		//Great the user by name

		System.out.println("Hi " + userName + ", nice to meet you!");
		
		//Generate a while loop to repeat the process until the user states to end it

		while (cont.equalsIgnoreCase("y")) {
			
			//Prompt user to enter an integer and specify parameters for entry
			System.out.println("Please enter an integer between 0 and 100 (no decimals!):");

			userEntry = scnr.nextInt();
			
			//Prompt user to enter a different number if their entry was outside paramaters
			if (userEntry > 100 || userEntry < 0) {
				System.out.println("Whoops, that's not between 0 and 100. Try again.");
			}

			//Create loop to follow if user enters an integer within paramaters
			else {
				
				//Create loop to handle odd number entries
				if ((userEntry % 2) != 0) {
					if (userEntry > 60) {
						System.out.println("OK " + userName + ", you've entered " + userEntry + ". Odd and over 60.");
					} else {
						System.out.println("OK " + userName + ", you've entered " + userEntry + ". Odd.");
					}
				}
				
				//Create loop to handle even number entries
				else {
					if (userEntry >= 2 && userEntry < 25) {
						System.out.println("OK " + userName + ", you've entered " + userEntry + ". Even and less than 25.");
					}
					if (userEntry >= 25 && userEntry <= 60) {
						System.out.println("OK " + userName + ". Even.");
					}
					if (userEntry > 60) {
						System.out.println("OK " + userName + ", you've entered " + userEntry + ". Even.");
					}
				}
				
				//Ask user whether to continue
				scnr.nextLine();
				System.out.println("Want to go again? (y/n)");
				cont = scnr.nextLine();
			}
			
		}
		
		//Say bye to user and close scanner
		System.out.println("OK, bye " + userName +"!");
		scnr.close();

	}

}
