package main;

import java.util.ArrayList;

public class Option {
	int maxPlayer;
	int maxEnemy;
	ArrayList<String> players = new ArrayList<String>();
	ArrayList<String> enemys = new ArrayList<String>();

	public Option() {
		this.maxPlayer = 1;
		this.maxEnemy = 1;
		players.add("Martial");
		enemys.add("Goblin");
	}

	public void menu() {
		System.out.println("1.maxPlayer,maxEnemy :" + maxPlayer + "," + maxEnemy);
		System.out.print("2.players :");
		for (int i = 0; i < players.size(); i++) {
			System.out.print(players.get(i) + " ");
		}
		System.out.println();
		System.out.print("3.enemys :");
		for (int i = 0; i < enemys.size(); i++) {
			System.out.print(enemys.get(i) + " ");
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
			if (input1 < 1 || 4 < input1 || input1 + input2 > 4) {
				System.out.println("不正な入力です。");
			}
			break;
		}
		maxPlayer = input1;
		maxEnemy = input2;
	}

	public void playersChange() {
		players.clear();

		System.out.println("1.Martial 2.Warrior 3.Wizard 4.Monk 5.Goblin");
		for (int i = 0; i < maxPlayer; i++) {
			int input = new java.util.Scanner(System.in).nextInt();
			switch (input) {
			case 1:
				players.add("Martial");
				break;
			case 2:
				players.add("Warrior");
				break;
			case 3:
				players.add("Wizard");
				break;
			case 4:
				players.add("Monk");
				break;
			case 5:
				players.add("Goblin");
				break;
			}
		}
	}
	
	public void enemysChange() {
		enemys.clear();

		System.out.println("1.Martial 2.Warrior 3.Wizard 4.Monk 5.Goblin");
		for (int i = 0; i < maxEnemy; i++) {
			int input = new java.util.Scanner(System.in).nextInt();
			switch (input) {
			case 1:
				enemys.add("Martial");
				break;
			case 2:
				enemys.add("Warrior");
				break;
			case 3:
				enemys.add("Wizard");
				break;
			case 4:
				enemys.add("Monk");
				break;
			case 5:
				enemys.add("Goblin");
				break;
			}
		}
	}

}
