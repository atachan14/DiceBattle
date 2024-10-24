package main;

import commands.Bang;
import commands.Precision;

public class Player extends Character {
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

	public void select() {

		while (true) {
			super.displayComandSelect();
			commandInput = new java.util.Scanner(System.in).nextInt() - 1;
			switch (commandInput) {
			case 0:
				return;
			case 1:
				return;
			case 2:
				return;
			case 3:
				return;
			default:
				System.out.println("不正な入力！");
				break;
			}
		}
	}

	public String getSpDisplay() {
		String SpDisplay = "";
		for (int i = 0; i < sp; i++) {
			SpDisplay += "●";
		}
		for (int i = 0; i < maxSp - sp; i++) {
			SpDisplay += "〇";
		}
		return SpDisplay;
	}
}
