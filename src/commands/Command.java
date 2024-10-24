package commands;

import main.Character;

public abstract class Command {
	String name;
	Character owner;
	int needSp = 0;
	int priority=2;
	String type = "攻撃"; 
	
	public Command(Character owner) {
		this.owner = owner;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public abstract void exe();
	
	public void exe(int bonus) {
		exeMesse();
		exeEffect();
	}
	
	public void exeMesse() {
		switch(type) {
		
		case "攻撃":
			owner.attackMesse(this);
			break;
		case "buff":
			System.out.println(owner.getName() + "は"+name+"を使用した！");
			break;
		case "debuff":
			System.out.println(owner.getName() + "は"+owner.target.getName()+"を"+name+"した！");
			break;
		}
	}
	
	public void exeEffect() {
		
	}
	
	
	
	

}
