package main;

public class Dice {
	int size = 6;

	int num1 = 0;
	int num2 = 0;

	public int roll(Character player) {
		int sumNum = 0;
		num1 = new java.util.Random().nextInt(size);
		num2 = new java.util.Random().nextInt(size);
		sumNum = num1 + num2;
		System.out.println(player.name + ":" + num1 + "+" + num2 + "=" + sumNum);
		return sumNum;
	}
}
