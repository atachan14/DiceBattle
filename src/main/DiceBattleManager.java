package main;

public class DiceBattleManager {
	Player player = new Player();
	Enemy enemy = new Enemy();
	Execute execute = new Execute();
	Display display = new Display();
	Dice dice = new Dice();

	Character[] allCharas = { player, enemy };
	int turnCount = 0;

	public void inPlay() {

		display.opening();
		while (true) {
			turnCount++;
			display.turnOfPlayer();
			player.select();
			enemy.select();
			priority1();
			priority2();
			execute.allCountDown();
		}
	}

}
