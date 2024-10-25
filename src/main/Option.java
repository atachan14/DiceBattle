package main;

import characters.Enemy;
import characters.Player;

public class Option {
	int maxPlayer = 1;
	int maxEnemy = 1;
	Player[] players = new Player[maxPlayer];
	Enemy[] enemys = new Enemy[maxEnemy];

	public void menu() {
		System.out.println("1.maxPlayer,maxEnemy :" + maxPlayer + "," + maxEnemy);
		System.out.print("2.players :");
		for (Player players : players) {
			System.out.print(players.getName() + " ");
		}
		System.out.println();
		System.out.print("3.enemys :");
		for (Enemy enemys : enemys) {
			System.out.print(enemys.getName() + " ");
		}
		System.out.println();
		int input = new java.util.Scanner(System.in).nextInt();
		menuSelect(input);
	}

	public void menuSelect(int input) {
		switch (input) {
		case 1:
			maxChange();
			break;
		case 2:
			playersChange();
			break;
		case 3:
			enemysChange();
			break;
		}
	}

	public void maxChange() {
		int input1;
		int input2;
		while (true) {
			System.out.println("maxPlayer（maxEnemyと合計して最大4人）　＞");
			input1 = new java.util.Scanner(System.in).nextInt();
			if (input1 < 1 || 4 < input1) {
				System.out.println("不正な入力です。");
				continue;
			}
			System.out.println("maxEnemy（maxPlayerと合計して最大4人）　＞");
			input2 = new java.util.Scanner(System.in).nextInt();
			if (input1 + input2 > 4) {
				System.out.println("不正な入力です。");
			}
			break;
		}
		maxPlayer = input1;
		maxEnemy = input2;

	}
	
	

}
