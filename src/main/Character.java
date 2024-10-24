package main;

import java.util.ArrayList;

import abnomals.Abnomal;
import commands.Attack;
import commands.Command;
import commands.Defense;

public class Character {
	String name;
	String camp;
	public int hp = 100;
	public int ad = 10;
	public int sp = 0;
	public int maxSp = 3;
	public int hitPer = 50;
	public int avoidPer = 50;

	public Character target;
	boolean survive = true;
	int commandInput = 0;

	Attack attack = new Attack(this);
	Defense defense = new Defense(this);

	Command[] hasCommand = new Command[4];
	ArrayList<Abnomal> hasAbnomal = new ArrayList<Abnomal>();

	public Character() {
	}

	public Command getAttack() {
		return hasCommand[0];
	}

	public int getCommandInput() {
		return commandInput;
	}

	public String getName() {
		return name;
	}

	public void attackMesse(Command command) {
		System.out.println(name + "の" + command.getName() + "！");
	}

	public void avoidMesse() {
		System.out.println(name + "は回避した！");
	}

	public void bonusAttackMesse(Command command) {
		System.out.println(name + "は" + target + "を" + command.getName() + "した！");
	}

	public void setTarget(Character target) {
		this.target = target;
	}

	public void addHasAbnomal(Abnomal abnomal) {
		hasAbnomal.add(abnomal);
	}

	public void removeHasAbnomal(Abnomal abnomal) {
		hasAbnomal.remove(abnomal);
	}

	public void allAbnomalCountDown() {
		for (Abnomal abnomals : hasAbnomal) {
			abnomals.addTurn(-1);
		}
	}

	public void displayComandSelect() {
		System.out.println(name + "'s select");
		for (int i = 0; i < hasCommand.length; i++) {
			System.out.print((i + 1) + "." + hasCommand[i].getName() + " ");
		}
		System.out.print("　＞");
	}
	
	public String getSpDisplay() {
		String SpDisplay = "";
		for (int i = 0; i < sp; i++) {
			SpDisplay += "●";
		}
		for (int i = 0; i < maxSp - sp; i++) {
			SpDisplay += "〇";
		}
		return SpDisplay;
	}
}