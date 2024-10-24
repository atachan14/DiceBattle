package main;

public class Attack extends Command {
	Dice dice = new Dice();
	int dmg;

	public Attack(Character owner) {
		super(owner);

		name = "攻撃";
		dmg = owner.ad;
	}

	public void exe() {
		owner.attackMesse(this);
		if (dice.attackDice(owner,owner.target)) {
			owner.target.hp -= dmg;
			System.out.println(owner.target + "に" + dmg + "のダメージ！");
		} else {
			System.out.println(owner.target + "は回避した！");
		}
	}
	
	public void exe(int bonus) {
		owner.bonusAttackMesse(this);
		if (dice.attackDice(owner,owner.target)) {
			owner.target.hp -= dmg;
			System.out.println(owner.target + "に" + dmg + "のダメージと"+bonus+"の追加ダメージ！");
		} else {
			System.out.println(owner.target + "は回避した！");
		}
	}
}
