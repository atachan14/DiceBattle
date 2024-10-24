package commands;

import abnomals.Obstructioned;
import main.Character;

public class Obstruction extends Command{
	int avoidPerDebuff = 30;
	int turn = 2;
	int type = 2;

	public Obstruction(Character owner) {
		super(owner);
		name = "妨害";
	}
	
	public void exe() {
		exeMesse();
		owner.addHasAbnomal(new Obstructioned(owner, turn, avoidPerDebuff));
	}
}
