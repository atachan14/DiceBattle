package abnomals;

import main.Character;

public class Defensed extends Abnomal {
	public Defensed(Character owner, Character from, int turn, int num) {
		super(owner, from, turn, num);

		name = "防御";
		owner.addAvoidPer(num);
	}

	public void cured() {
		owner.addAvoidPer(-num);
	}
	
	public void inTheMiddleMesse() {
		
	}
}
