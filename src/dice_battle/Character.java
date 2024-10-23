package dice_battle;

public class Character {
	String name;
	int hp=100;
	int ap=10;
	int sp=0;
	int maxSp=3;
	int hitPer=50;
	int avoidPer=50;
	int command=0;

	public void attack(Character taget) {
		System.out.println("攻撃した！");
	}
	
	public void attack(Character taget, int bonus) {
		System.out.println("攻撃した！");
	}

	public void defense() {
		this.avoidPer+=40;

	}

}
