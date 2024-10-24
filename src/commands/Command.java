package commands;

import main.Character;

public abstract class Command {
	String name;
	Character owner;
	int needSp = 0;
	int useSp = 0;
	int priority = 2;
	String type = "攻撃";

	public Command(Character owner) {
		this.owner = owner;
	}

	public void exe() {
		exeMesse();
		exeEffect();
	}

	public void exe(int bonus) {
		exeMesse();
		exeEffect();
	}
	
	public void exeEffect() {
		System.out.println("中身がない！");
	}

	public void exeMesse() {
		switch (type) {

		case "攻撃":
			owner.attackMesse(this);
			break;
		case "buff":
			System.out.println(owner.getName() + "は" + name + "を使用した！");
			break;
		case "debuff":
			System.out.println(owner.getName() + "は" + owner.target.getName() + "を" + name + "した！");
			break;
		case "強化攻撃":
			System.out.println(owner.getName() + "の" + name + "！");
		}
	}

	public String getName() {
		return name;
	}

	public int getPriority() {
		return priority;
	}

	

}
