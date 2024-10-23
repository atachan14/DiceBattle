package main;

public class DiceBattleManager {
	Player player = new Player();
	Enemy enemy = new Enemy();
	Display display = new Display();
	Character[] allCharas = {player,enemy};
	int turnCount=0;

	public void inPlay() {
		display.opening();
		while(true) {
		turnCount++;
		countJudge();
		display.turnOfPlayer();
		player.select();
		enemy.select();
		defenseFaze();
		attackFaze();
		
		}
	}
	
}
