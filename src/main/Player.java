package main;

import commands.*;

public class Player extends Character {
	Attack attack = new Attack(this);
	Defense defense = new Defense(this);
	Bang bang = new Bang(this);
	Precision precision = new Precision(this);

	public Player() {
		this.name = "player";
		this.camp = "player";
		this.ad = 20;
		this.hitPer = 70;

		hasCommand[0] = attack;
		hasCommand[1] = defense;
		hasCommand[2] = bang;
		hasCommand[3] = precision;

	}

	public void selectCommand() {
		System.out.println(name + "'s select");
		int input = 0;

		while (true) {
			displayCommandSelect();
			input = new java.util.Scanner(System.in).nextInt();
			if (input < 1 || input > 4) {
				System.out.println("不正な入力！");
			} else {
				break;
			}
		}
		reserveCommand = hasCommand[input - 1];
	}
}
