package characters;

import commands.Attack;
import commands.ChargeForAttack;
import commands.Defense;
import commands.Obstruction;

public class Warrior extends Character {
	Attack attack = new Attack(this);
	Defense defense = new Defense(this);
	ChargeForAttack chargeAttack = new ChargeForAttack(this);
	Obstruction obstruction = new Obstruction(this);

	public Warrior() {
		this.name = "Warrior";

		hasCommand[0] = attack;
		hasCommand[1] = defense;
		hasCommand[2] = chargeAttack;
		hasCommand[3] = obstruction;
	}
}