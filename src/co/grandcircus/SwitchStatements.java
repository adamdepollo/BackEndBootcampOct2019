package co.grandcircus;

import java.util.Scanner;

public class SwitchStatements {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String name = "";
		String favFood = "";

		System.out.println("Please enter a name:");

		name = scnr.nextLine().toUpperCase();

		switch (name) {
		case "STEVE":
			favFood = "burger";
			break;
		case "JIM":
			favFood = "broccoli";
			break;
		case "ALICE":
			favFood = "pasta";
			break;
		case "SHAUNDRA":
			favFood = "ice cream";
			break;
		default:
			System.out.println("You didn't enter a valid name.");
		}
		
		if (!(favFood.equals(""))) {

		System.out.println(name + "'s favorite food is " + favFood + ".");
		}

		// Close the scanner
		scnr.close();

	}

}
