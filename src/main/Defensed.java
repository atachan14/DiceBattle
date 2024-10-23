package main;

public class Defensed extends Abnomal {

	public Defensed(Character owner, int turn, int num) {
		super(owner, turn, num);

		owner.avoidPer += num;
	}

	public void cured() {
		owner.avoidPer -= num;
	}
}
