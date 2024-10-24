package main;

public class Bang extends Command {
	int bonus = 25;

	public Bang(Character owner) {
		super(owner);

		name = "強打";
		needSp = owner.sp;
		bonus *= needSp;
	}

	public void exe(Character target) {
		System.out.println(owner + "の" + name + "！");
		owner.attack.exe(target,bonus);
	}
}
