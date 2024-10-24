package main;

public class Enemy extends Character{
	ChargeAttack chargeAttack = new ChargeAttack(this);
	Obstructioned obstruction = new Obstructioned(this);
	
	public Enemy() {
		this.name = "enemy";
		
		hasCommand.add(attack);
		hasCommand.add(defense);
		hasCommand.add(chargeAttack);
		hasCommand.add(obstruction);
	}
	
	
	
	
	public void select() {
		
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
