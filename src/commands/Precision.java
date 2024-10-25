package commands;

import abnomals.Precisioned;
import characters.Character;

public class Precision extends Command {
	int hitPerBuff = 30;
	int turn = 2;

	public Precision(Character owner) {
		super(owner);
		this.name = "精密";
		this.type = "debuff";

		needSp = 1;
	}
	
	public void exeMesse() {
		System.out.println(owner.getName() + "は集中力を高めた！");
	}

	public void exeEffect() {
		useSp = owner.getSp();
		turn *= useSp;
		owner.addHasAbnomal(new Precisioned(owner, owner, turn, hitPerBuff));
	}
}
