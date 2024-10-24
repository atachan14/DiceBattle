package main;

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
			System.out.printf("【%-14s",chara.name+"】");
		}
		System.out.println();
		for(Character chara:dbm.allCharacters) {
			System.out.printf("HP:%-12s",chara.hp);
		}
		System.out.println();
		for(Character chara:dbm.allCharacters) {
			System.out.printf("SP:%-10s",chara.getSpDisplay());
		}
		System.out.println();
		for(Character chara:dbm.allCharacters) {
			System.out.printf("攻撃力:%-9s",chara.ad);
		}
		System.out.println();
		for(Character chara:dbm.allCharacters) {
			System.out.printf("命中率:%-9s",chara.hitPer);
		}
		System.out.println();
		for(Character chara:dbm.allCharacters) {
			System.out.printf("回避率:%-9s",chara.avoidPer);
		}
		System.out.println();
		System.out.println("-----------------------------");

		}

	public void spDisplay() {
		for (int i = 0; i < dbm.player.sp; i++) {
			System.out.print("●");
		}
		for (int i = 0; i < dbm.player.maxSp - dbm.player.sp; i++) {
			System.out.print("〇");
		}
		System.out.println();
	}

	public void endTurn() {
		System.out.println("next turn ＞");
		new java.util.Scanner(System.in).nextLine();
	}
	
	public void result() {
		System.out.println(dbm.allCharacters.get(0).camp+"の勝利！");
	}
}
