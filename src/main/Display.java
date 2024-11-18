package main;

import characters.Character;

public class Display {
	DBM dbm;

	public Display(DBM dbm) {
		this.dbm = dbm;

	}

	public void opening() {
		System.out.println("-----------------------");
		System.out.print("はじまるよ！ 	push enter ＞");
		new java.util.Scanner(System.in).nextLine();
	}

	public void startTurn() {
		System.out.println("----------------------------------------");
		System.out.println(dbm.turnCount + "ターン目");
		for (Character chara : dbm.allCharacters) {
			System.out.printf("%-15s", "【" + chara.getDCN() + deadSuffix(chara) + "】");
		}
		System.out.println();
		for (Character chara : dbm.allCharacters) {
			System.out.printf("%-17s", "HP:" + chara.getHp());
		}
		System.out.println();
		for (Character chara : dbm.allCharacters) {
			System.out.printf("%-13s", chara.getSpDisplay());
		}
		System.out.println();
		for (Character chara : dbm.allCharacters) {
			System.out.printf("%-14s", "攻撃力:" + chara.getAd());
		}
		System.out.println();
		for (Character chara : dbm.allCharacters) {
			System.out.printf("%-14s", "命中率:" + chara.getHitPer());
		}
		System.out.println();
		for (Character chara : dbm.allCharacters) {
			System.out.printf("%-14s", "回避率:" + chara.getAvoidPer());
		}
		System.out.println();
		System.out.println("-----------------------------");

	}

	public String deadSuffix(Character chara) {
		if (chara.getLife() == false) {
			return "(dead)";
		}
		return "";
	}

	public void endTurn() {
		System.out.println("next turn ＞");
		new java.util.Scanner(System.in).nextLine();
	}

	public void result() {
		System.out.println(dbm.winner + "の勝利！");
		System.out.print("生存者:");
		for (int i = 0; i < dbm.allPlayers.size(); i++) {
			if (dbm.allPlayers.get(i).getLife()) {
				System.out.println(dbm.allPlayers.get(i).getName() + " ");
			}
		}
	}

	public static int inputAndCheckLoop(int min, int max) {
		while (true) {
			int input = new java.util.Scanner(System.in).nextInt();
			if (input < min || max < input) {
				System.out.print("不正な入力！＞");
			} else {
				return input;
			}
		}
	}
}
