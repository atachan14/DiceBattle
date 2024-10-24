package abnomals;

import main.Character;

public class Precisioned extends Abnomal {
	String name = "精密";

	public Precisioned(Character owner, Character from, int turn, int num) {
		super(owner, from, turn, num);

		owner.addHitPer(num);
	}

	public void cured() {
		owner.addHitPer(-num);
	}
	
	public void inTheMiddleMesse() {
		
	}
}
