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
		for(Character chara:dbm.allCharacters) {
			System.out.printf("%-15s","【"+chara.getName()+"】");
		}
		System.out.println();
		for(Character chara:dbm.allCharacters) {
			System.out.printf("%-18s","HP:"+chara.getHp());
		}
		System.out.println();
		for(Character chara:dbm.allCharacters) {
			System.out.printf("%-14s","SP:"+chara.getSpDisplay());
		}
		System.out.println();
		for(Character chara:dbm.allCharacters) {
			System.out.printf("%-15s","攻撃力:"+chara.getAd());
		}
		System.out.println();
		for(Character chara:dbm.allCharacters) {
			System.out.printf("%-15s","命中率:"+chara.getHitPer());
		}
		System.out.println();
		for(Character chara:dbm.allCharacters) {
			System.out.printf("%-15s","回避率:"+chara.getAvoidPer());
		}
		System.out.println();
		System.out.println("-----------------------------");

		}

	public void spDisplay() {
		for (int i = 0; i < dbm.player.getSp(); i++) {
			System.out.print("●");
		}
		for (int i = 0; i < dbm.player.getMaxSp() - dbm.player.getSp(); i++) {
			System.out.print("〇");
		}
		System.out.println();
	}

	public void endTurn() {
		System.out.println("next turn ＞");
		new java.util.Scanner(System.in).nextLine();
	}
	
	public void result() {
		System.out.println(dbm.allCharacters.get(0).getCamp()+"の勝利！");
	}
}
