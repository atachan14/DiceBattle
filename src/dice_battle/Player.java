package dice_battle;

public class Player extends Character {
	int sp;
	int maxSp;

	public Player() {
		this.name = "player";
		this.ap = 30;
		this.hitPer = 70;
		this.avoidPer = 70;
	}

	public void bang(Character taget) {
		sp--;
		super.attack(taget, 30);
	}

	public void precision() {
		sp--;
		hitPer += 40;
	}
	
	public void select() {
		while (true) {
			command = new java.util.Scanner(System.in).nextInt();
			switch (command) {
			case 1:
				System.out.println(name+"の攻撃！");
				return;
			case 2:
				System.out.println(name+"の防御！");
				return;
			case 3:
				System.out.println(name+"の強打！");
				return;
			case 4:
				System.out.println(name+"の精密！");
				return;
			default:
				System.out.println("不正な入力！");
				System.out.print("1.攻撃 2.防御 3.強打 4.精密");
				break;
			}
		}
	}
}
