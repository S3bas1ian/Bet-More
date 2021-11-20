public class Shuffle {
	int cards[] = new int[100];

	public Shuffle() {
		mixCards();
	}

	public void mixCards() {
		int N = 100;
		int[] array = new int[N];

		for (int i = 0; i < N; i++) {
			array[i] = i;
		}

		for (int i = 0; i < N; i++) {
			int randIndex = (int) (Math.random() * N);
			int tmp = array[i];
			array[i] = array[randIndex];
			array[randIndex] = tmp;
		}
		cards = array;
	}

	public int[] getCards() {
		return cards;
	}

}
