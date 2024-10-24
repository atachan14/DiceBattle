package commands;

import main.Character;

public class Bang extends Command {
	int bonus = 25;

	public Bang(Character owner) {
		super(owner);

		name = "強打";
		needSp = owner.sp;
		bonus *= needSp;
	}

	public void exe() {
		System.out.println(owner.getName() + "の" + name + "！");
		owner.getAttack().exe(bonus);
	}
}
