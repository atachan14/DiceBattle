package abnomals;

import main.Character;

public class Obstructioned extends Abnomal {
	String name = "妨害";

	public Obstructioned(Character owner, Character from, int turn, int num) {
		super(owner, from, turn, num);

		owner.addAvoidPer(-num);
	}

	public void cured() {
		owner.addAvoidPer(num);
	}
	
	public void inTheMiddleMesse() {

	}
}
