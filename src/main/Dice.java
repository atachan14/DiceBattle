package main;

import characters.Character;

public class Dice {
	int size = 6;

	int num1 = 0;
	int num2 = 0;

	public int roll(Character chara) {
		int num = new java.util.Random().nextInt(size)+1;
		return num;
	}

	public boolean attackDice(Character owner, Character target) {
		int ownerDice1 = roll(owner);
		int ownerDice2 = roll(owner);
		int ownerLuck = ownerDice1+ownerDice2+owner.getHitPer();
		System.out.println(" "+owner.getDCN()+":"+ownerDice1+"+"+ownerDice2+"+"+owner.getHitPer()+"="+ownerLuck);

		int targetDice1 = roll(target);
		int targetDice2 = roll(target);
		int targetLuck = targetDice1+targetDice2+target.getAvoidPer();
		System.out.println(" "+target.getDCN()+":"+targetDice1+"+"+targetDice2+"+"+target.getAvoidPer()+"="+targetLuck);
		
		if (ownerLuck > targetLuck) {
			return true;
		}else {
			return false;
		}
	}
}
