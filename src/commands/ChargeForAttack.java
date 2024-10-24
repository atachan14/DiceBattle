package commands;

import abnomals.ChargedForAttack;
import main.Character;

public class ChargeForAttack extends Command{
	int bonus = 25;
	int turn = 2;
	
	public ChargeForAttack(Character owner) {
		super(owner);
		name = "溜め攻撃";

		needSp = 1;
		useSp = owner.sp;
		bonus *= useSp;
	}

	public void exeMesse() {
		System.out.println(owner.getName() + "は力を溜めている！");
	}
	
	public void exeEffect() {
		owner.addHasAbnomal(new ChargedForAttack(owner, turn, bonus));
	}
}
