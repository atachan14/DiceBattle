package characters;

import java.util.ArrayList;
import main.Display;
import abnomals.Abnomal;
import commands.Command;

public class Character {
	String name = "nonCharacter";
	String camp = "P";

	int hp = 100;
	int ad = 10;
	int ap = 10;

	int sp = 0;
	int maxSp = 4;
	int hitPer = 50;
	int avoidPer = 50;

	Character target;
	boolean Life = true;
	int skipSelect = 0;

	Command reserveCommand;
	Command[] hasCommand = new Command[4];
	ArrayList<Abnomal> hasAbnomal = new ArrayList<Abnomal>();

	public Character() {
	}

	public void selectCommand() {
		if (this.camp == "P") { // playerの処理
			System.out.println(getDCN() + "'s select");
			displayCommandSelect();
			int input = Display.inputAndCheckLoop(1, 4);
			this.reserveCommand = this.hasCommand[input - 1];

		} else { // enemyの処理
			int input = new java.util.Random().nextInt(4);
			this.reserveCommand = this.hasCommand[input];

		}
	}

	public void displayCommandSelect() {
		for (int i = 0; i < this.hasCommand.length; i++) {
			System.out.print((i + 1) + "." + this.hasCommand[i].getName() + " ");
		}
		System.out.print("　＞");
	}

	public void selectTarget() {
		if (this.camp == "P") { // playerの処理
			System.out.print("　target : ");
			displayTargetSelect();
			int input = Display.inputAndCheckLoop(1, reserveCommand.getErea().size());
			this.reserveCommand.setTarget(this.reserveCommand.getErea().get(input - 1));

		} else { // enemyの処理
			int input = new java.util.Random().nextInt(4);
			this.reserveCommand = this.hasCommand[input];

		}
	}

	public void displayTargetSelect() {
		for (int i = 0; i < this.reserveCommand.getErea().size(); i++) {
			System.out.print((i + 1) + "." + this.reserveCommand.getErea().get(i).getDCN() + " ");
		}
		System.out.print(" ＞");
	}

	public void setCommand(Command command) {
		this.reserveCommand = command;
	}

	public Command getAttack() {
		return this.hasCommand[0];
	}

	public String getDCN() {
		return this.camp + "." + this.name;
	}

	public String getName() {
		return this.name;
	}

	public String getCamp() {
		return this.camp;
	}

	public void setCamp(String camp) {
		this.camp = camp;
	}

	public void dead() {
		this.Life = false;
	}

	public boolean getLife() {
		return this.Life;
	}

	public int getSkipSelect() {
		return skipSelect;
	}

	public void addSkipSelect(int num) {
		this.skipSelect += num;
	}

	public Command getReserveCommand() {
		return this.reserveCommand;
	}

	public void setReserveCommand(Command command) {
		this.reserveCommand = command;
	}

	public void attackMesse(Command command) {
		System.out.println(this.name + "の" + command.getName() + "！");
	}

	public void bonusAttackMesse(Command command) {
		System.out.println(this.name + "は" + this.target + "を" + command.getName() + "した！");
	}

	public void avoidMesse() {
		System.out.println(this.name + "は回避した！");
	}

	public void dyingMesse() {
		System.out.println(this.name + "は消滅した・・・");
	}

	public Character getTarget() {
		return this.target;
	}

	public void setTarget(Character target) {
		this.target = target;
	}

	public void addHasAbnomal(Abnomal abnomal) {
		this.hasAbnomal.add(abnomal);
	}

	public void removeHasAbnomal(Abnomal abnomal) {
		this.hasAbnomal.remove(abnomal);
	}

	public void allAbnomalCountDown() {
		for (int i = 0; i < this.hasAbnomal.size(); i++) {
			if (this.hasAbnomal.get(i).getTurn() > 0) {
				this.hasAbnomal.get(i).addTurn(-1);
			}
			if (this.hasAbnomal.get(i).getTurn() > 0) {
				this.hasAbnomal.get(i).inTheMiddle();
			} else {
				this.hasAbnomal.get(i).cured();
				this.hasAbnomal.remove(i);
				i--;
			}
		}
	}

	public int getHp() {
		return this.hp;
	}

	public void addHp(int num) {
		this.hp += num;
	}

	public int getSp() {
		return this.sp;
	}

	public void addSp(int num) {
		if (this.sp + num > this.maxSp) {
			num = this.maxSp - this.sp;
		}
		this.sp += num;
	}

	public int getMaxSp() {
		return this.maxSp;
	}

	public int getAd() {
		return this.ad;
	}

	public void addAd(int num) {
		this.ad += num;
	}

	public int getAp() {
		return this.ap;
	}

	public void addAp(int ap) {
		this.ap += ap;
	}

	public int getHitPer() {
		return this.hitPer;
	}

	public void addHitPer(int num) {
		this.hitPer += num;
	}

	public int getAvoidPer() {
		return this.avoidPer;
	}

	public void addAvoidPer(int num) {
		this.avoidPer += num;
	}

	public String getSpDisplay() {

		if (this.camp == "P") {
			String SpDisplay = "SP:";
			for (int i = 0; i < sp; i++) {
				SpDisplay += "●";
			}
			for (int i = 0; i < maxSp - sp; i++) {
				SpDisplay += "〇";
			}
			return SpDisplay;
		} else {
			String SpDisplay = "       ";
			return SpDisplay;
		}
	}
}