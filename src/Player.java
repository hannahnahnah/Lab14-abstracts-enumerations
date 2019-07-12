
public abstract class Player {

	protected String name;
	
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName() {
		this.name = name;
	}
	
	public abstract Roshambo generateRoshambo();
	
	public Roshambo generateRoshambo(Roshambo validatedPlayed) {
		return null;
	}

	@Override
	public String toString() {
		return "Player Name: " + name + ".";
	}
	
	
	
}//class
