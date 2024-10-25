package abnomals;

import main.Character;

public class Precisioned extends Abnomal {

	public Precisioned(Character owner, Character from, int turn, int num) {
		super(owner, from, turn, num);

		this.name = "精密";
		owner.addHitPer(num);
	}

	public void cured() {
		owner.addHitPer(-num);
	}
	
	
}
