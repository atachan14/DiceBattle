package commands;

import characters.Character;

public class ChargeAttack extends Command {
	int bonus;
	int turn = 1;

	public ChargeAttack(Character owner, int bonus,Character target) {
		super(owner);
		name = "溜め攻撃";
		type = "強化攻撃";
		this.target =target;
		
		this.bonus = bonus;
	}

	public void exeMesse() {

	}

	public void exeEffect() {
		Attack attack = new Attack(owner);
		attack.setTarget(target);
		attack.exe(bonus);
	}
}
