
public class RockPlayer extends Player {

	public RockPlayer(String name) {
		super(name);
	}
	
	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.rock;
	}

	@Override
	public String toString() {
		return "RockPlayer Name: " + name + ", Played: " + generateRoshambo() + ".";
	}
	
	
	
}
