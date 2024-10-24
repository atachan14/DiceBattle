package main;

import java.util.ArrayList;
import commands.*;

public class DBM {
	Player player;
	Enemy enemy;
	ArrayList<Character> allPlayers = new ArrayList<Character>();
	ArrayList<Character> allEnemys = new ArrayList<Character>();
	ArrayList<Character> allCharacters = new ArrayList<Character>();
	ArrayList<Command> reserveCommands = new ArrayList<Command>();

	Execute execute;
	Display display;
	Dice dice = new Dice();

	int turnCount = 0;

	public DBM() {
		this.player = new Player();
		this.enemy = new Enemy();

		allPlayers.add(player);
		allEnemys.add(enemy);
		allCharacters.add(player);
		allCharacters.add(enemy);

		execute = new Execute(this);
		display = new Display(this);
	}

	public void runGame() {

		display.opening();
		while (allPlayers.size() > 0 || allEnemys.size() > 0) {
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
