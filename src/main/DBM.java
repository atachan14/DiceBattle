package main;

import java.util.ArrayList;

import characters.Character;
import characters.Enemy;
import characters.Player;
import commands.Command;

public class DBM {
	Option option;
	ArrayList<Player> allPlayers = new ArrayList<Player>();
	ArrayList<Enemy> allEnemys = new ArrayList<Enemy>();
	ArrayList<Character> allCharacters = new ArrayList<Character>();
	ArrayList<Command> reserveCommands = new ArrayList<Command>();

	Execute execute;
	Display display;
	Dice dice = new Dice();

	int turnCount = 0;

	public DBM(Option option) {
		this.option = option;
		this.execute = new Execute(this);
		this.display = new Display(this);

		allPlayers.add(player);
		allEnemys.add(enemy);
		allCharacters.add(player);
		allCharacters.add(enemy);

	}

	public void setUp(Option option) {
		for (int i = 0; i < option.players.length; i++) {
			allPlayers.add(option.players[i]);
		}
	}

	public void runGame() {
		setUp(option);
		display.opening();
		while (allPlayers.size() != 0 && allEnemys.size() != 0) {
			System.out.println(allPlayers.size() + "," + allEnemys.size());

			turnCount++;
			execute.autoTargetSet();
			display.startTurn();
			execute.stanbyFase();
			execute.selectFase();

			System.out.println("--------------------");
			execute.priority1Fase();
			execute.priority2Fase();
			execute.priority3Fase();
			execute.endFase();
			display.endTurn();
		}
		display.result();
	}

}
