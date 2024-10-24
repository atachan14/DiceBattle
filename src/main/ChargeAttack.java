package main;

public class ChargeAttack extends Command{
	int bonus = 25;
	int turn = 2;
	
	public ChargeAttack(Character owner) {
		super(owner);

		name = "溜め攻撃";
		needSp = owner.sp;
		bonus *= needSp;
	}

	public void exe() {
		System.out.println(owner + "は力を溜めている！");
		owner.hasAbnomal.add(new ChargeForAttack(owner, turn, bonus));
	}
}
