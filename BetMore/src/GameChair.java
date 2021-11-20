
public class GameChair {

	public static Player getWinner(Player p1, Player p2) {
		if (p1.getCard() > p2.getCard()) {
			return p1;
		} else {
			return p2;
		}
	}

}
