package commands;

import abnomals.Defensed;
import main.Character;

public class Defense extends Command {
	int num = 30;
	int turn = 1;

	public Defense(Character owner) {
		super(owner);
		this.name = "防御";
		this.type = "buff";

		this.priority = 1;
	}

	public void exe() {
		System.out.println(owner.getName() + "は身を守っている！");
		owner.addHasAbnomal(new Defensed(owner, owner, turn, num));
	}
}
