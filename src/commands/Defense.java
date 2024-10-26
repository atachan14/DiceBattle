package commands;

import abnomals.Defensed;
import characters.Character;

public class Defense extends Command {
	int num = 30;
	int turn = 1;

	public Defense(Character owner) {
		super(owner);
		this.name = "防御";
		this.type = "buff";

		this.priority = 1;
	}

	public void exeEffect() {
		owner.addSp(1);
		owner.addHasAbnomal(new Defensed(owner, owner, turn, num));
	}
	
	public void exeMesse() {
		System.out.println(owner.getDCN() + "は身を守っている！");
	}
}
