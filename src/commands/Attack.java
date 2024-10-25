package commands;

import characters.Character;
import main.Dice;

public class Attack extends Command {
	Dice dice = new Dice();
	int dmg;

	public Attack(Character owner) {
		super(owner);
		name = "攻撃";
	}
	
	public void exeEffect() {
		owner.addSp(1);
		dmg=owner.getAd();
		if (dice.attackDice(owner, owner.target)) {
			owner.target.addHp(-dmg);
			System.out.println(owner.target.getName() + "に" + dmg + "のダメージ！");
		} else {
			owner.target.avoidMesse();
		}
	}

	public void exeEffect(int bonus) {
		owner.addSp(1);
		dmg=owner.getAd();
		if (dice.attackDice(owner, owner.target)) {
			owner.target.addHp(-(dmg+bonus));
			System.out.println(owner.target.getName() + "に" + dmg + "のダメージと" + bonus + "の追加ダメージ！");
		} else {
			owner.target.avoidMesse();
		}
	}
}
