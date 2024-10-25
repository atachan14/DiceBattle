package commands;

import characters.Character;

public class Bang extends Command {
	int bonus = 25;

	public Bang(Character owner) {
		super(owner);
		name = "強打";
		type = "強化攻撃";

		needSp = 1;

	}

	public void exeEffect() {
		useSp = owner.getSp();
		bonus *= useSp;
		owner.getAttack().exe(bonus);
	}
}
