package commands;

import abnomals.Obstructioned;
import characters.Character;

public class Obstruction extends Command {
	int avoidPerDebuff = 30;
	int turn = 2;

	public Obstruction(Character owner) {
		super(owner);
		this.name = "妨害";
		this.type = "debuff";

		needSp = 1;
	}

	public void exeEffect() {
		useSp = owner.getSp();
		turn *= useSp;
		owner.addHasAbnomal(new Obstructioned(owner.target, owner, turn, avoidPerDebuff));
	}
}
