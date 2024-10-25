package main;

public class Main {

	public static void main(String[] args) {
		System.out.println("DiceBattle");
		startDisplay();

	}

	public static void startDisplay() {
		
		Option option = new Option();

		while (true) {
			System.out.print("1.play 2.option 3.end　＞");
			int input = new java.util.Scanner(System.in).nextInt();
			switch (input) {
			case 1:
				DBM dbm = new DBM(option);
				dbm.runGame();
				break;
			case 2:
				option.menu();
				break;
			case 3:
				endDisplay();
				break;
			}
		}
	}

	public static void endDisplay() {
		System.out.println("DiceBattleを終了します。");
	}
}