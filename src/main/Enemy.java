package main;

public class Enemy extends Character{
	int chargeCount = 0;
	
	public Enemy() {
		this.name = "enemy";
		
	}
	
	public void chargeAttack(Character taget,int bonus) {
		sp--;
		chargeCount++;
		super.attack(taget,30);
	}
	
	public void obstruction() {
		sp--;
		
		
	}
	
	public void select() {
		if(chargeCount ==1) {
			chargeCount--;
			command=31;
			return;
		}
		
		command = new java.util.Random().nextInt(4);
		switch (command) {
		case 1:
			System.out.println(name+"の攻撃！");
			return;
		case 2:
			System.out.println(name+"の防御！");
			return;
		case 3:
			System.out.println(name+"は力を溜めている！");
			return;
		case 31:
			System.out.println(name+"の溜め攻撃！");
		
		case 4:
			System.out.println(name+"の妨害！");
			return;
		default:
			System.out.println("不正な入力！");
			System.out.print("1.攻撃 2.防御 3.強打 4.精密");
			break;
		}
	}
}
