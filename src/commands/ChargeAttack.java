package commands;

import abnomals.ChargeForAttack;
import main.Character;

public class ChargeAttack extends Command{
	int bonus = 25;
	int turn = 2;
	
	public ChargeAttack(Character owner) {
		super(owner);

		name = "溜め攻撃";
		needSp = owner.sp;
		bonus *= needSp;
	}

	public void exe() {
		System.out.println(owner.getName() + "は力を溜めている！");
		owner.addHasAbnomal(new ChargeForAttack(owner, turn, bonus));
	}
}
