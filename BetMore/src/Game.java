public class Game {

	private static Player computer, player;
	private static int currentCardIndex = 1;
	private static GUI gui;

	public Game() {
		// TODO Auto-generated method stub
		Shuffle s = new Shuffle();
		computer = new Player(s, "computer");
		computer.pickCard(0);
		player = new Player(s, "player");
		player.pickCard();
		gui = new GUI(computer, player);
		init();
	}

	public void changeCard() {
		currentCardIndex++;
		player.pickCard(currentCardIndex);
	}

	private void init() {
		gui.setGame(this);
	}

	public Player getWinner() {
		return GameChair.getWinner(computer, player);
	}

	public void reset() {
		Shuffle s = new Shuffle();
		computer = new Player(s, "computer");
		computer.pickCard(0);
		player = new Player(s, "player");
		player.pickCard(currentCardIndex);
	}

	public Player getComputer() {
		return computer;
	}

	public Player getPlayer() {
		return player;
	}
}
