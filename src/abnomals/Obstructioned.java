package abnomals;

import main.Character;

public class Obstructioned extends Abnomal {
	String name = "妨害";

	public Obstructioned(Character owner, int turn, int num) {
		super(owner, turn, num);

		owner.avoidPer -= num;
	}
	
	public void cured() {
		owner.avoidPer += num;
		super.cured(this);
	}
}
