package main;

import commands.ChargeForAttack;
import commands.Obstruction;

public class Enemy extends Character {
	ChargeForAttack chargeAttack = new ChargeForAttack(this);
	Obstruction obstruction = new Obstruction(this);

	public Enemy() {
		this.name = "enemy";
		this.camp = "enemy";

		hasCommand[0] = attack;
		hasCommand[1] = defense;
		hasCommand[2] = chargeAttack;
		hasCommand[3] = obstruction;
	}

	public void select() {
		commandInput = new java.util.Random().nextInt(4);
	}
}
