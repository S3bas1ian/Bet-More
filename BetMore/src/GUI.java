import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI extends JFrame {

	private JButton getCard, newGame, getWinner;
	private JTextField currentCard;
	private JTextArea console;
	private Player computer, player;
	private int counter = 0;
	private Game game;

	public GUI(Player p1, Player p2) {
		super("Bet More");
		computer = p1;
		player = p2;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setSize(300, 500);

		console = new JTextArea();
		console.setLayout(null);
		console.setEditable(false);
		console.setBounds(50, 280, 210, 180);
		add(console);

		getCard = new JButton("get Card");
		getCard.setBounds(50, 120, 100, 30);
		getCard.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (counter < 5) {
					player.pickCard();
					currentCard.setText("" + player.getCard());
					counter++;
				}

			}
		});
		add(getCard);

		getWinner = new JButton("Winner");
		getWinner.setBounds(50, 160, 100, 30);
		getWinner.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				console.append("Winner is: " + GameChair.getWinner(computer, player).getName() + "\n");
			}
		});
		add(getWinner);

		currentCard = new JTextField("" + player.getCard());
		currentCard.setBounds(50, 30, 50, 50);
		currentCard.setEditable(false);
		add(currentCard);

		newGame = new JButton("new Game");
		newGame.setBounds(50, 220, 100, 30);
		newGame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				game.reset();
				counter = 0;
				computer = game.getComputer();
				player = game.getPlayer();
				currentCard.setText(player.getCard() + "");
				console.append("new Game \n");
				repaint();

			}
		});
		add(newGame);

		setVisible(true);
	}

	public void setGame(Game game) {
		this.game = game;
	}

}
