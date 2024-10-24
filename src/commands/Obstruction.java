package commands;

import abnomals.Obstructioned;
import main.Character;

public class Obstruction extends Command{
	int avoidPerDebuff = 30;
	int turn = 2;

	public Obstruction(Character owner) {
		super(owner);
		this.name = "妨害";
		this.type = "debuff";
		
		needSp=1;
		useSp=owner.sp;
		turn *= useSp;
	}
	
	public void exeEffect() {
		owner.addHasAbnomal(new Obstructioned(owner, turn, avoidPerDebuff));
	}
}
