package main;

public class Bang extends Command {
	int bonus = 30;

	public Bang(Character owner) {
		super(owner);

		name = "強打！";
	}

	public void exe(Character target) {
		System.out.println(owner + "の" + "強打！");
	}
}
