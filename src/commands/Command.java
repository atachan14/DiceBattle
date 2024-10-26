package commands;

import java.util.ArrayList;

import characters.Character;

public abstract class Command {
	String name;
	Character owner;

	int priority = 2;
	String type = "攻撃";

	Character target;
	String ereaCode = "ene";
	ArrayList<Character> erea;
	String range;

	int needSp = 0;
	int useSp = 0;

	public Command(Character owner) {
		this.owner = owner;
	}

	public void exe() {
		if (type == "攻撃" && target.getLife() == false) {
			owner.overKillMesse();
			exeEffect();
			owner.addSp(-useSp);
			return;
		}

		if (owner.getSp() < needSp) {
			owner.shortageSpMesse();
			return;
		}
		
		if(owner.getLife()==false) {
			return;
		}

		exeMesse();
		exeEffect();
		owner.addSp(-useSp);
	}

	public void exe(int bonus) {
		exeMesse();
		exeEffect(bonus);
	}
	public void exe(int bonus,Character target) {
		exeMesse();
		exeEffect(bonus,target);
	}
	
	public void exeEffect() {
		System.out.println("中身がない！");
	}

	public void exeEffect(int bonus) {
		System.out.println("中身がない！");
	}
	
	public void exeEffect(int bonus,Character target) {
		System.out.println("中身がない！");
	}

	public void exeMesse() {
		switch (type) {

		case "攻撃":
			owner.attackMesse(this);
			break;
		case "buff":
			System.out.print(owner.getDCN() + "は" + name + "を使用した！");
			break;
		case "debuff":
			System.out.print(owner.getDCN() + "は" + target.getDCN() + "を" + name + "した！");
			break;
		case "強化攻撃":
			System.out.println(owner.getDCN() + "の" + name + "！");
		}
	}

	public Character getOwner() {
		return this.owner;
	}

	public Character getTarget() {
		return this.target;
	}
	
	public int getNeedSp() {
		return this.needSp;
	}

	public void setTarget(Character target) {
		this.target = target;
	}

	public String getEreaCode() {
		return this.ereaCode;
	}

	public ArrayList<Character> getErea() {
		return this.erea;
	}

	public void setErea(ArrayList<Character> erea) {
		this.erea = erea;
	}

	public String getName() {
		return name;
	}

	public int getPriority() {
		return priority;
	}

}
