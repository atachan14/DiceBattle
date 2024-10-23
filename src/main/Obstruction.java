package main;

public class Obstruction extends Abnomal {
	String name = "妨害";

	public Obstruction(Character owner, int turn, int num) {
		super(owner, turn, num);

		owner.avoidPer -= num;
	}
	
	public void cured() {
		owner.avoidPer += num;
	}
}
