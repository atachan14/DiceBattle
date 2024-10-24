package commands;

import abnomals.Precisioned;
import main.Character;

public class Precision extends Command {
	int hitPerBuff = 30;
	int turn = 3;

	public Precision(Character owner) {
		super(owner);

		this.name = "精密";
	}

	public void exe() {
		System.out.println(owner.getName() + "は集中力を高めた！");
		owner.addHasAbnomal(new Precisioned(owner, turn, hitPerBuff));
	}
}
