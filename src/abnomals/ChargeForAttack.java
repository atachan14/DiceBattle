package abnomals;

import main.Character;

public class ChargeForAttack extends Abnomal{
	
	public ChargeForAttack(Character owner, int turn, int num) {
		super(owner, turn, num);

	}

	public void cured() {
		owner.getAttack().exe(num);
		super.cured(this);
	}
	
	
}
