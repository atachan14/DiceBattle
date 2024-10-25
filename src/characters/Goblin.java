package characters;

import commands.Attack;
import commands.ChargeForAttack;
import commands.Defense;
import commands.Obstruction;

public class Goblin extends Character {
	Attack attack = new Attack(this);
	Defense defense = new Defense(this);
	ChargeForAttack chargeAttack = new ChargeForAttack(this);
	Obstruction obstruction = new Obstruction(this);

	public Goblin() {
		this.name = "Goblin";
		this.camp = "e";

		hasCommand[0] = attack;
		hasCommand[1] = defense;
		hasCommand[2] = chargeAttack;
		hasCommand[3] = obstruction;
	}
}
