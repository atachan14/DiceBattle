package abnomals;

import main.Character;

public class ChargedForAttack extends Abnomal{
	
	public ChargedForAttack(Character owner, int turn, int num) {
		super(owner, turn, num);

	}

	public void cured() {
		owner.getAttack().exe(num);
		super.cured(this);
	}
	
	
}
