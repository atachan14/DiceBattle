package main;

import java.util.ArrayList;

public class DBM {
	Player player;
	Enemy enemy;
	ArrayList<Character> allPlayers = new ArrayList<Character>();
	ArrayList<Character> allEnemys = new ArrayList<Character>();
	ArrayList<Character> allCharacters = new ArrayList<Character>();

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

	public void inPlay() {

		display.opening();
		while (true) {
			turnCount++;
			execute.autoTargetSet();
			display.startTurn();
			player.select();
			enemy.select();
			System.out.println("--------------------");

			execute.priority1Fase();
			execute.priority2Fase();
			execute.allPlayerAbnomalCountDown();
			display.endTurn();
		}
	}

}
