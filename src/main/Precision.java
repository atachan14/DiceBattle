package main;

public class Precision extends Abnomal {
	String name = "精密";

	public Precision(Character owner, int turn, int num) {
		super(owner, turn, num);

		owner.hitPer += num;
	}
	
	public void cured() {
		owner.hitPer -= num;
	}
}
