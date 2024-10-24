package main;

import java.util.ArrayList;

public class Character {
	String name;
	int hp = 100;
	int ad = 10;
	int sp = 0;
	int maxSp = 3;
	int hitPer = 50;
	int avoidPer = 50;
	
	Character target;
	boolean survive = true;
	int command = 0;
	
	Attack attack = new Attack(this);
	Defense defense = new Defense(this);

	ArrayList<Command> hasCommand = new ArrayList<Command>();
	ArrayList<Abnomal> hasAbnomal = new ArrayList<Abnomal>();
	
	public Character() {
	}
	
	public void setTarget(Character target) {
		this.target = target;
	}
	
	public void attackMesse(Command command) {
		System.out.println(name + "の"+command.name+"！");
	}

	public void bonusAttackMesse(Command command) {
		System.out.println(name+"は"+target+"を"+command.name+"した！");
	}
	
}