
public class RandomPlayer extends Player {

	public RandomPlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		int random = (int)((Math.random() * 3) + 1);
		if (random == 1) {
			return Roshambo.rock;
		} else if (random == 2) {
			return Roshambo.scissors;
		} else {
			return Roshambo.paper;
		}
	}

}//class
