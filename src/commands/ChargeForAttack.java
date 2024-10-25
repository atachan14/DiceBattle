package commands;

import abnomals.ChargedForAttack;
import characters.Character;

public class ChargeForAttack extends Command {
	int bonus = 25;
	int turn = 1;

	ChargeAttack chargeAttack;

	public ChargeForAttack(Character owner) {
		super(owner);
		name = "溜め攻撃";

		needSp = 1;
	}

	public void exeMesse() {
		System.out.println(owner.getName() + "は力を溜めている！");
	}

	public void exeEffect() {
		useSp = owner.getSp();
		bonus *= useSp;
		chargeAttack = new ChargeAttack(owner, bonus);
		owner.addHasAbnomal(new ChargedForAttack(owner, owner, turn, chargeAttack));
	}
}
