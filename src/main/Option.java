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
		System.out.println("[1].maxPlayer,maxEnemy :" + maxPlayer + "," + maxEnemy);
		System.out.print("[2].player party :");
		for (int i = 0; i < players.size(); i++) {
			System.out.print(players.get(i) + " ");
		}
		System.out.println();
		System.out.print("[3].enemy party :");
		for (int i = 0; i < enemys.size(); i++) {
			System.out.print(enemys.get(i) + " ");
		}
		System.out.println("[4].return");
		System.out.println();
		int input = new java.util.Scanner(System.in).nextInt();
		menuSelect(input);
	}

	public void menuSelect(int input) {
		while (true) {
			switch (input) {
			case 1:
				maxChange();
				break;
			case 2:
				players.clear();
				playersChange();
				break;
			case 3:
				enemys.clear();
				enemysChange();
				break;
			case 4:
				return;
			default:
				System.out.println("不正な入力です！");
				break;
			}
			menu();
		}
	}

	public void maxChange() {
		int input1;
		int input2;
		while (true) {
			System.out.println("maxPlayer（最大5人）　＞");
			input1 = new java.util.Scanner(System.in).nextInt();
			if (input1 < 1 || 5 < input1) {
				System.out.println("不正な入力です。");
				continue;
			}
			System.out.println("maxEnemy（最大5人）　＞");
			input2 = new java.util.Scanner(System.in).nextInt();
			if (input1 < 1 || 5 < input1 || input1 + input2 > 4) {
				System.out.println("不正な入力です。");
			}
			break;
		}
		maxPlayer = input1;
		maxEnemy = input2;

		if (maxPlayer > players.size()) {
			playersChange();
		} else if (maxPlayer < players.size()) {
			for (int i = 0; i < (maxPlayer - players.size()); i++) {
				players.remove(players.size() - 1);
			}
		}

		if (maxEnemy > enemys.size()) {
			playersChange();
		} else if (maxEnemy < enemys.size()) {
			for (int i = 0; i < (maxEnemy - enemys.size()); i++) {
				enemys.remove(enemys.size() - 1);
			}
		}
	}

	public void playersChange() {
		System.out.println("1.Martial 2.Warrior 3.Wizard 4.Monk 5.Goblin");
		for (int i = players.size(); i < maxPlayer; i++) {
			System.out.println(i + "人目");
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
		System.out.println("1.Martial 2.Warrior 3.Wizard 4.Monk 5.Goblin");
		for (int i = enemys.size(); i < maxEnemy; i++) {
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
