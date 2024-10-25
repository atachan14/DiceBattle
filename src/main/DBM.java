package main;

import java.util.ArrayList;
import characters.*;
import characters.Character;

import commands.Command;

public class DBM {
	Option option;
	Execute execute;
	Display display;
	Dice dice = new Dice();

	ArrayList<Character> allPlayers = new ArrayList<Character>();
	ArrayList<Character> allEnemys = new ArrayList<Character>();
	ArrayList<Character> allCharacters = new ArrayList<Character>();
	ArrayList<Command> reserveCommands = new ArrayList<Command>();

	int turnCount = 0;
	boolean lastPlayerSuvive = true;
	boolean lastEnemySuvive = true;
	String winner = "";


	public DBM(Option option) {
		this.option = option;
		this.execute = new Execute(this);
		this.display = new Display(this);
	}	

	public void runGame() {
		
		generateCharacter();
		display.opening();
		
		while (lastPlayerSuvive && lastEnemySuvive) {
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
		execute.winnerJudge();
		display.result();
	}
	
	public void generateCharacter() {
		for (int i = 0; i < option.players.size(); i++) {
			switch (option.players.get(i)) {
			case "Martial":
				allPlayers.add(new Martial());
				break;
			case "Goblin":
				allPlayers.add(new Goblin());
				break;
			case "Warrior":
				allPlayers.add(new Warrior());
				break;
			case "Wizard":
				allPlayers.add(new Wizard());
				break;
			case "Monk":
				allPlayers.add(new Monk());
				break;
			}
		}
		for (int i = 0; i < option.enemys.size(); i++) {
			switch (option.enemys.get(i)) {
			case "Martial":
				allEnemys.add(new Martial());
				break;
			case "Goblin":
				allEnemys.add(new Goblin());
				break;
			case "Warrior":
				allEnemys.add(new Warrior());
				break;
			case "Wizard":
				allEnemys.add(new Wizard());
				break;
			case "Monk":
				allEnemys.add(new Monk());
				break;
			}
		}
		for (Character player : allPlayers) {
			player.setCamp("player");
			allCharacters.add(player);
		}
		for (Character enemy : allEnemys) {
			enemy.setCamp("enemy");
			allCharacters.add(enemy);
		}
	}
}
