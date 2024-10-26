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
		if (dice.attackDice(owner, target)) {
			System.out.print(target.getDCN() + "に" + dmg + "のダメージ！");
			target.addHp(-dmg);
		} else {
			target.avoidMesse();
		}
	}

	public void exeEffect(int bonus) {
		dmg=owner.getAd();
		if (dice.attackDice(owner, target)) {
			System.out.print(target.getDCN() + "に" + dmg + "のダメージと" + bonus + "の追加ダメージ！");
			target.addHp(-(dmg+bonus));
		} else {
			target.avoidMesse();
		}
	}
}
