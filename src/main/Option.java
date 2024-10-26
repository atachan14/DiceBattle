package main;

import java.util.ArrayList;

public class Option {
	int maxPlayers;
	int maxEnemys;
	ArrayList<String> players = new ArrayList<String>();
	ArrayList<String> enemys = new ArrayList<String>();

	public Option() {
		this.maxPlayers = 3;
		this.maxEnemys = 3;
		players.add("Martial");
		players.add("Warrior");
		players.add("Wizard");

		enemys.add("Goblin");
		enemys.add("Goblin");
		enemys.add("Goblin");
	}

	public void menuDisplay() {
		System.out.println("--------------------------------");
		System.out.println("[1]party size :" + maxPlayers + "," + maxEnemys);
		System.out.print("[2]p.party :");
		for (int i = 0; i < players.size(); i++) {
			System.out.print(players.get(i) + " ");
		}
		System.out.println();
		System.out.print("[3]e.party :");
		for (int i = 0; i < enemys.size(); i++) {
			System.out.print(enemys.get(i) + " ");
		}
		System.out.println();
		System.out.println("[9]return");

	}

	public void menu() {
		while (true) {
			menuDisplay();
			int input = new java.util.Scanner(System.in).nextInt();
			switch (input) {
			case 1:
				maxChange();
				break;
			case 2:
				players.clear();
				partyChange(players, maxPlayers);
				break;
			case 3:
				enemys.clear();
				partyChange(enemys, maxEnemys);
				break;
			case 9:
				return;
			default:
				System.out.println("不正な入力です！");
				break;
			}
		}
	}

	public void maxChange() {
		int input1;
		int input2;
		while (true) {
			System.out.print("maxPlayer（最大5人）　＞");
			input1 = new java.util.Scanner(System.in).nextInt();
			if (input1 < 1 || 5 < input1) {
				System.out.println("不正な入力です。");
				continue;
			}
			System.out.print("maxEnemy（最大5人）　＞");
			input2 = new java.util.Scanner(System.in).nextInt();
			if (input1 < 1 || 5 < input1) {
				System.out.println("不正な入力です。");
			}
			break;
		}

		maxPlayers = input1;
		maxEnemys = input2;

		if (maxPlayers > players.size()) {
			System.out.println();
			System.out.println("playersを追加してください。");
			partyChange(players, maxPlayers);
		} else if (maxPlayers < players.size()) {
			for (int i = 0; i < (maxPlayers - players.size()); i++) {
				players.remove(players.size() - 1);
			}
		}

		if (maxEnemys > enemys.size()) {
			System.out.println();
			System.out.println("enemysを追加してください。");
			partyChange(enemys, maxEnemys);
		} else if (maxEnemys < enemys.size()) {
			for (int i = 0; i < (maxEnemys - enemys.size()); i++) {
				enemys.remove(enemys.size() - 1);
			}
		}
	}

	public void partyChange(ArrayList<String> camps, int maxCamps) {
		System.out.println("1.Martial 2.Warrior 3.Wizard 4.Monk 5.Goblin");
		for (int i = camps.size(); i < maxCamps; i++) {
			System.out.print(" " + (i + 1) + "人目　＞");
			int input = new java.util.Scanner(System.in).nextInt();
			switch (input) {
			case 1:
				camps.add("Martial");
				break;
			case 2:
				camps.add("Warrior");
				break;
			case 3:
				camps.add("Wizard");
				break;
			case 4:
				camps.add("Monk");
				break;
			case 5:
				camps.add("Goblin");
				break;
			default:
				System.out.println("不正な入力はゴブリンになります！");
				camps.add("Goblin");
				break;
			}
		}
	}
}
