package commands;

import main.Character;

public class ChargeAttack extends Command {
	int bonus;
	int turn = 1;

	public ChargeAttack(Character owner, int bonus) {
		super(owner);
		name = "溜め攻撃";
		type = "強化攻撃";
		
		this.bonus = bonus;
	}

	public void exeMesse() {

	}

	public void exeEffect() {
		owner.getAttack().exe(bonus);
	}
}
