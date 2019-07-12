import java.util.Scanner;

public class ConsolePlayer extends Player {

	private Scanner scnr;
	
	public ConsolePlayer(String name) {
		super(name);
	}
	
	public void ConsolePicker(Scanner scnr) {
		this.scnr = scnr;
	}
	
	public Roshambo generateRoshambo(Roshambo userPlayed) {
		
			if (userPlayed == Roshambo.rock) {
				return Roshambo.rock;
			} else if (userPlayed == Roshambo.paper) {
				return Roshambo.paper;
			} else {
				return Roshambo.scissors;	
			}	
	}

	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		return null;
	}

}
