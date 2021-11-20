public class Game {

	private static Player computer, player;
	private static int currentCardIndex = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shuffle s = new Shuffle();
		computer = new Player(s);
		computer.pickCard(0);
		player = new Player(s);
		player.pickCard(currentCardIndex);
	}

	public void changeCard() {
		currentCardIndex++;
		player.pickCard(currentCardIndex);
	}

	public Player getWinner() {
		return GameChair.getWinner(computer, player);
	}

	public void reset() {
		Shuffle s = new Shuffle();
		computer = new Player(s);
		computer.pickCard(0);
		player = new Player(s);
		player.pickCard(currentCardIndex);
	}
}
