package commands;

import main.Character;
import main.Dice;

public class Attack extends Command {
	Dice dice = new Dice();
	int dmg;

	public Attack(Character owner) {
		super(owner);

		name = "攻撃";
		dmg = owner.ad;
	}

	public void exe() {
		exeMesse();	
	}

	public void exe(int bonus) {
		exeMesse();
	}
	
	public void exeEffect() {
		if (dice.attackDice(owner, owner.target)) {
			owner.target.hp -= dmg;
			System.out.println(owner.target.getName() + "に" + dmg + "のダメージ！");
		} else {
			owner.target.avoidMesse();
		}
	}

	public void exeEffect(int bonus) {
		if (dice.attackDice(owner, owner.target)) {
			owner.target.hp -= dmg + bonus;
			System.out.println(owner.target.getName() + "に" + dmg + "のダメージと" + bonus + "の追加ダメージ！");
		} else {
			owner.target.avoidMesse();
		}

	}
}
