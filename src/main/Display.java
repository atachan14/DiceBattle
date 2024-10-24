package main;

public class Display {
	DBM dbm;
	Player player;
	Enemy enemy;
	int turnCount;
	
	public Display(DBM dbm) {
		this.dbm=dbm;	
		this.player = dbm.player;
		this.enemy = dbm.enemy;
		
		this.turnCount = dbm.turnCount;
		
		
	}

	public void opening() {
		System.out.println("-----------------------");
		System.out.print("はじまるよ！");
		System.out.println(" 	push enter ＞");
		new java.util.Scanner(System.in).nextLine();
	}

	public void startTurn() {

		System.out.println("---------------");
		System.out.println(dbm.turnCount + "ターン目");
		System.out.println("【" + player.name + "】");
		System.out.println("HP:" + player.hp);
		System.out.print("SP:");
		spDisplay();
		System.out.println("攻撃力:" + player.ad);
		System.out.println("命中率:" + player.hitPer);
		System.out.println("防御力:" + player.avoidPer);
		System.out.println();
		System.out.println("【" + enemy.name + "】");
		System.out.println("HP:" + enemy.hp);
		System.out.println("攻撃力:" + enemy.ad);
		System.out.println("命中率:" + enemy.hitPer);
		System.out.println("防御力:" + enemy.avoidPer);

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
