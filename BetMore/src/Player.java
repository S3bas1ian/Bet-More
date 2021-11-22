
public class Player {

	private int card;
	private Shuffle s;
	private int pickedCards = 0;
	private String name;

	public Player(Shuffle s, String name) {
		this.s = s;
		this.name = name;
	}

	public void pickCard() {
		if (pickedCards < 6) {
			card = s.getCards()[pickedCards + 1];
			pickedCards++;
		}

	}

	public String getName() {
		return name;
	}

	public void pickCard(int i) {
		if (pickedCards < 6) {
			card = s.getCards()[i];
			pickedCards++;
		}

	}

	public int getCard() {
		return card;
	}

}
