package abnomals;

import characters.Character;

public class Obstructioned extends Abnomal {

	public Obstructioned(Character owner, Character from, int turn, int num) {
		super(owner, from, turn, num);

		this.name = "妨害";
		owner.addAvoidPer(-num);
	}
	
	public void curedEffect() {
		owner.addAvoidPer(num);
	}
	
}
