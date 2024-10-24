package main;

import commands.Attack;
import commands.ChargeForAttack;
import commands.Defense;
import commands.Obstruction;

public class Enemy extends Character {
	Attack attack = new Attack(this);
	Defense defense = new Defense(this);
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
}
