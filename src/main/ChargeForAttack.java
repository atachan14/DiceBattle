package main;

public class ChargeForAttack extends Abnomal{
	
	public ChargeForAttack(Character owner, int turn, int num) {
		super(owner, turn, num);

	}

	public void cured() {
		owner.attack.exe(num);
	}
	
	
}
