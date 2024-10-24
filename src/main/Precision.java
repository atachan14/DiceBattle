package main;

public class Precision extends Command {
	int hitPerBuff = 30;
	int turn = 3;

	public Precision(Character owner) {
		super(owner);

		name = "精密";
	}

	public void exe() {
		System.out.println(owner + "は集中力を高めた！");
		owner.hasAbnomal.add(new Precisioned(owner, turn, hitPerBuff));
	}
}
