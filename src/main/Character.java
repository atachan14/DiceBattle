package main;

import java.util.ArrayList;

import abnomals.Abnomal;
import commands.Attack;
import commands.Command;
import commands.Defense;

public class Character {
	String name;
	String camp;
	int hp = 100;
	int ad = 10;
	int sp = 0;
	int maxSp = 4;
	int hitPer = 50;
	int avoidPer = 50;

	public Character target;
	boolean survive = true;
	int skipTurn = 0;

	Command reserveCommand;
	Command[] hasCommand = new Command[4];
	ArrayList<Abnomal> hasAbnomal = new ArrayList<Abnomal>();

	public Character() {
	}

	public void selectCommand() {
		int input = new java.util.Random().nextInt(4);
		reserveCommand = hasCommand[input];
	}

	public void setCommand(Command command) {
		reserveCommand = command;
	}

	public Command getAttack() {
		return hasCommand[0];
	}

	public String getName() {
		return name;
	}

	public void attackMesse(Command command) {
		System.out.println(name + "の" + command.getName() + "！");
	}

	public void bonusAttackMesse(Command command) {
		System.out.println(name + "は" + target + "を" + command.getName() + "した！");
	}

	public void avoidMesse() {
		System.out.println(name + "は回避した！");
	}

	public void dyingMesse() {
		System.out.println(name + "は消滅した・・・");
	}

	public void setTarget(Character target) {
		this.target = target;
	}

	public void addSkipTurn(int num) {
		skipTurn += num;
	}

	public void addHasAbnomal(Abnomal abnomal) {
		hasAbnomal.add(abnomal);
	}

	public void removeHasAbnomal(Abnomal abnomal) {
		hasAbnomal.remove(abnomal);
	}

	public void allAbnomalCountDown() {
		System.out.println("aacd start");
		for (int i = 0; i < hasAbnomal.size(); i++) {

			System.out.print(hasAbnomal.get(i).getName() + " ");
			System.out.println(hasAbnomal.get(i).getTurn());
			if (hasAbnomal.get(i).getTurn() > 0) {
				if (hasAbnomal.get(i).getTurn() > 1) {
					hasAbnomal.get(i).inTheMiddle();
					hasAbnomal.get(i).addTurn(-1);
					continue;
				}

				hasAbnomal.get(i).cured();
				hasAbnomal.get(i).addTurn(-1);
				hasAbnomal.remove(i);
				i--;

			}
		}
	}

	public void displayCommandSelect() {
		for (int i = 0; i < hasCommand.length; i++) {
			System.out.print((i + 1) + "." + hasCommand[i].getName() + " ");
		}
		System.out.print("　＞");
	}

	public int getHp() {
		return hp;
	}

	public int getSp() {
		return sp;
	}

	public int getMaxSp() {
		return maxSp;
	}

	public int getAd() {
		return ad;
	}

	public int getHitPer() {
		return hitPer;
	}

	public int getAvoidPer() {
		return avoidPer;
	}

	public void addHp(int num) {
		hp += num;
	}

	public void addSp(int num) {
		if (sp + num > maxSp) {
			num = maxSp - sp;
		}
		sp += num;
	}

	public void addAd(int num) {
		ad += num;
	}

	public void addHitPer(int num) {
		hitPer += num;
	}

	public void addAvoidPer(int num) {
		avoidPer += num;
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