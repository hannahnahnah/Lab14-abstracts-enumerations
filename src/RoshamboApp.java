import java.util.Scanner;

public class RoshamboApp {

	static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int userWins = 0;
		int opponentWins = 0;
		String userContinue = null;
		
		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.println("Enter your name: ");
		String userName = scnr.nextLine();
		Player console = new ConsolePlayer(userName);
		Player opponent = null;
		
		System.out.println("Would you like to play against the Jets or the Sharks? (j/s): ");
		String opponentChoice = RoshamboValidators.opponentVal(scnr);
		if (opponentChoice.equals("RockPlayer")) {
			opponent = new RockPlayer("Jets");
		} else if (opponentChoice.equals("RandomPlayer")) {
			opponent = new RandomPlayer("Sharks");
		}
		
		
		do {
			System.out.println("Rock, paper, or scissors? (r/p/s): ");
			Roshambo validatedPlayed = RoshamboValidators.choiceVal(scnr);
			
			Roshambo userResult = console.generateRoshambo(validatedPlayed);
			Roshambo opponentResult = opponent.generateRoshambo();
			
			System.out.println(userName + ": " + userResult);
			System.out.println(opponent.getName() + ": " + opponentResult);
			
			if (userResult == opponentResult) { //surely there is a more elegant way of doing this... but i am tired. so this works...
				System.out.println("Draw!");
			} else if (userResult == Roshambo.rock && opponentResult == Roshambo.scissors) {
				System.out.println(userName + " wins!");
				++userWins;
			} else if (userResult == Roshambo.rock && opponentResult == Roshambo.paper) {
				System.out.println(opponent.getName() + " wins!");
				++opponentWins;
			} else if (userResult == Roshambo.paper && opponentResult == Roshambo.scissors) {
				System.out.println(opponent.getName() + " wins!");
				++opponentWins;
			} else if (userResult == Roshambo.paper && opponentResult == Roshambo.rock) {
				System.out.println(userName + " wins!");
				++userWins;
			} else if (userResult == Roshambo.scissors && opponentResult == Roshambo.rock) {
				System.out.println(opponent.getName() + " wins!");
				++opponentWins;
			} else if (userResult == Roshambo.scissors && opponentResult == Roshambo.paper) {
				System.out.println(userName + " wins!");
				++userWins;
			}
		} while (playAgain());
		
		int userLosses = opponentWins;
		int opponentLosses = userWins;
		System.out.println(userName + " won: " + userWins + ", lost " + userLosses + ".");
		System.out.println(opponent.getName() + " won: " + opponentWins + ", lost " + opponentLosses + ".");
		
		if (userWins > opponentWins) {
			System.out.println(userName + " is the winner of this session.");
		} else if (opponentWins > userWins) {
			System.out.println(opponent.getName() + " is the winner of this session.");
		} else {
			System.out.println("It's all a wash.");
		}

	}//main
	
	public static boolean playAgain() {
		System.out.println("Play again? (y/n)");
		
		
		do {
			String userContinue = scnr.nextLine();
			if (userContinue.substring(0, 1).equalsIgnoreCase("y")) {
				return true;
			} else if (userContinue.substring(0, 1).equalsIgnoreCase("n")) {
				return false;
			} else {
				System.out.println("That was not a valid entry. Please enter \"y\" or \"n\"");
			}
		} while (true);
	}

}//class
