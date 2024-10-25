package characters;

import commands.*;

public class Martial extends Character {
	Attack attack = new Attack(this);
	Defense defense = new Defense(this);
	Bang bang = new Bang(this);
	Precision precision = new Precision(this);

	public Martial() {
		this.name = "Martial";
		this.camp = "p";
		this.ad = 20;
		this.hitPer = 70;

		hasCommand[0] = attack;
		hasCommand[1] = defense;
		hasCommand[2] = bang;
		hasCommand[3] = precision;

	}
}
