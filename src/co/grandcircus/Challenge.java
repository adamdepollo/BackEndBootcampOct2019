package co.grandcircus;

import java.util.Scanner;

/*
 * Your goal: Determine what a user should wear based on the 
 * type of event they're attending and the temperature outside.
 * 
 * Options: 
 * eventType should be used as a condition for eventClothing
 *  casual = something comfy
 *  semi-formal = business casual or a polo
 *  formal = a suit
 *  
 * temperature should be used as a condition for tempClothing 
 *  temperature < 54 = a coat
 *  temperature > 74 = no jacket
 *  temperature between 54 and 74 = a jacket
 *  
 *  Bonus Challenge: Ask the user if they would like to continue and go again
 */
public class Challenge {
	public static void main(String[] args) {

		// Declare variables and create scanner
		String eventType = "";
		String eventClothing = "";
		String jacket = "";
		double temp;
		String cont = "y";
		Scanner scnr = new Scanner(System.in);

		while (cont.equalsIgnoreCase("y")) {

			System.out.println("Please enter the temperature:");
			temp = scnr.nextDouble();

			// clear the scanner
			scnr.nextLine();

			System.out.println("What type of event are you having: casual, formal, or semi-formal?");

			eventType = scnr.nextLine();
			eventType = eventType.toLowerCase();

			switch (eventType) {
			case "casual":
				eventClothing = "something comfy";
				break;
			case "semi-formal":
				eventClothing = "business casual or a polo";
				break;
			case "formal":
				eventClothing = "a suit";
				break;
			}

			if (temp < 54) {
				jacket = "a coat";
			} else if (temp >= 54 && temp <= 74) {
				jacket = "a jacket";
			} else {
				jacket = "no jacket";
			}

			if (temp > 110 || temp < 10) {
				System.out.println("Why are you worried about what to wear? It's " + temp
						+ " degrees outside. You should probably cancel, dude.");
			}

			else {

				System.out.println("Since you're having a " + eventType + " event and it's " + temp
						+ " degrees outside, you should wear " + eventClothing + " with " + jacket + ".");

			}

			System.out.println();

			System.out.println("Try again? (y/n)");

			cont = scnr.nextLine();

			System.out.println();

		}

		System.out.println("Bye!");

		scnr.close();

	}
}