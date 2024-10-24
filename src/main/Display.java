package main;

public class Display {
	DBM dbm;
	Player player;
	Enemy enemy;

	int turnCount;

	public Display(DBM dbm) {
		this.dbm = dbm;
		this.player = dbm.player;
		this.enemy = dbm.enemy;

		this.turnCount = dbm.turnCount;

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
		for (int i = 0; i < player.sp; i++) {
			System.out.print("●");
		}
		for (int i = 0; i < player.maxSp - player.sp; i++) {
			System.out.print("〇");
		}
		System.out.println();
	}

	public void endTurn() {
		System.out.println("next turn ＞");
		new java.util.Scanner(System.in).nextLine();
	}

//	public void commandDisplay(Character character) {
//		System.out.println(character.name+"'s turn");
//		for(int i = 0;i<character.hasCommand.length;i++) {
//			System.out.print((i+1)+"."+character.hasCommand[i].getName()+" ");
//			}
//	}
}
