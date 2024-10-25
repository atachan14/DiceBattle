package main;

public class Main {

	public static void main(String[] args) {
		System.out.println("DiceBattle");
		DBM dbm = new DBM();
		dbm.runGame();
	}

	public static void endDisplay() {
		System.out.println("DiceBattleを終了します。");
	}
}