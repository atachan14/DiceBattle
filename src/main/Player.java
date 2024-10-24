package main;

public class Player extends Character {
	Bang bang = new Bang(this);
	Precision precision = new Precision(this);
	
	public Player() {
		this.name = "player";
		this.ad = 20;
		this.hitPer = 70;
		
		hasCommand.add(attack);
		hasCommand.add(defense);
		hasCommand.add(bang);
		hasCommand.add(precision);
	}
	
	public void attackMesse(Command command) {
		System.out.println(name+"の"+command.name+"！");
	}
	
	public void bonusAttackMesse(Command command) {
		System.out.println(name+"は"+target+"を"+command.name+"した！");
	}
	

	public void select() {
		while (true) {
			command = new java.util.Scanner(System.in).nextInt();
			switch (command) {
			case 1:
				return;
			case 2:
				return;
			case 3:
				return;
			case 4:
				return;
			default:
				System.out.println("不正な入力！");
				System.out.print("1.攻撃 2.防御 3.強打 4.精密");
				break;
			}
		}
	}
}
