package main;

public class Attack extends Command {
	Dice dice = new Dice();
	int dmg;

	public Attack(Character owner) {
		super(owner);

		name = "攻撃";
		dmg = owner.ad;
	}

	public void exe(Character target) {
		System.out.println(owner + "の攻撃！");
		if (dice.roll(owner) > dice.roll(target)) {
			target.hp -= dmg;
			System.out.println(target + "に" + dmg + "のダメージ！");
		} else {
			System.out.println(target + "は回避した！");
		}
	}
}
