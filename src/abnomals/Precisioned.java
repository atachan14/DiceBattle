package abnomals;

import main.Character;

public class Precisioned extends Abnomal {
	String name = "精密";

	public Precisioned(Character owner, int turn, int num) {
		super(owner, turn, num);

		owner.hitPer += num;
	}
	
	public void cured() {
		owner.hitPer -= num;
		super.cured(this);
	}
}
