package abnomals;

import characters.Character;
import commands.ChargeAttack;

public class ChargedForAttack extends Abnomal {
	ChargeAttack chargeAttack;

	public ChargedForAttack(Character owner, Character from, int turn, ChargeAttack chargeAttack) {
		super(owner, from, turn, 0);

		name = "溜め";
		this.chargeAttack = chargeAttack;
	}

	public void curedEffect() {
		owner.addSkipSelect(1);
		owner.setCommand(chargeAttack);
	}

	public void curedMesse() {
		System.out.println(owner.getDCN() + "に力が溜まった！");
	}

	public void inTheMiddleMesse() {
		System.out.println(owner.getDCN() + "は力を溜めている・・・");
	}
}
