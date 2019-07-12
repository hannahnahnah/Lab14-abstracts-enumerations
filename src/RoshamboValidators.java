import java.util.Scanner;

public class RoshamboValidators {
	
	public static String opponentVal(Scanner scnr) {
		do {
			String userOpponentChoice = scnr.nextLine();
			if (userOpponentChoice.substring(0, 1).equalsIgnoreCase("j")) {
				return "RockPlayer";
			} else if (userOpponentChoice.substring(0, 1).equalsIgnoreCase("s")) {
				return "RandomPlayer";
			} else {
				System.out.println("That was not a valid entry. Please enter \"j\" or \"s\": ");
			}
		} while (true);
	}
	
	public static Roshambo choiceVal(Scanner scnr) {
		String userPlayed = scnr.nextLine();
		do {
			if (userPlayed.substring(0, 1).equalsIgnoreCase("r")) {
				return Roshambo.rock;
			} else if (userPlayed.substring(0, 1).equalsIgnoreCase("p")) {
				return Roshambo.paper;
			} else if (userPlayed.substring(0, 1).equalsIgnoreCase("s")) {
				return Roshambo.scissors;
			} else {
				System.out.println("That was not a valid entry. Please enter \"r\", \"p\", or \"s\"");
				userPlayed = scnr.nextLine();
			}
		} while (true);
	}

}//class
