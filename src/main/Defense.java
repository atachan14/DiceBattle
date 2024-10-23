package main;

public class Defense extends Command {
	int num = 30;

	public Defense(Character owner) {
		super(owner);

		name = "防御";
		this.priority = 1;
	}

	public void exe() {
		System.out.println(owner + "は身を守ってる！");
		owner.hasAbnomal.add(new Defensed(owner, 1, num));
	}
}
