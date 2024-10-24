package commands;

import main.Character;

public class Bang extends Command {
	int bonus = 25;

	public Bang(Character owner) {
		super(owner);
		name = "強打";
		type = "強化攻撃";

		needSp = 1;
		useSp = owner.sp;
		bonus *= useSp;

	}

	public void exeEffect() {
		owner.getAttack().exe(bonus);
	}
}
