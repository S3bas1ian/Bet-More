
public class Player {

	private int card;
	private Shuffle s;
	private int pickedCards = 0;

	public Player(Shuffle s) {
		this.s = s;
	}

	public void pickCard(int i) {
		if (pickedCards > 5) {
			card = s.getCards()[i];
			pickedCards++;
		}

	}

	public int getCard() {
		return card;
	}

}
