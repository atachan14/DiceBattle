package abnomals;

import main.Character;
import commands.*;

public class ChargedForAttack extends Abnomal {
	ChargeAttack chargeAttack;

	public ChargedForAttack(Character owner, Character from, int turn, ChargeAttack chargeAttack) {
		super(owner, from, turn, 0);

		name = "溜め";
		this.chargeAttack = chargeAttack;
	}

	public void cured() {
		owner.addSkipTurn(1);
		owner.setCommand(chargeAttack);
	}

	public void curedMesse() {
		System.out.println(owner.getName() + "に力が溜まった！");
	}

	public void inTheMiddleMesse() {
		System.out.println(owner.getName() + "は力を溜めている・・・");
	}
}
