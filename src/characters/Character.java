package characters;

import java.util.ArrayList;
import main.DBM;

import abnomals.Abnomal;
import commands.Command;

public class Character {
	String name = "character";
	String camp = "p";
	int hp = 100;
	int ad = 10;
	int ap = 10;

	int sp = 0;
	int maxSp = 4;
	int hitPer = 50;
	int avoidPer = 50;

	public Character target;
	boolean Life = true;
	int skipSelect = 0;

	Command reserveCommand;
	Command[] hasCommand = new Command[4];
	ArrayList<Abnomal> hasAbnomal = new ArrayList<Abnomal>();

	public Character() {
	}

	public void selectCommand() {
		if (this.camp == "p") { // playerの処理
			System.out.println(this.name + "'s select");
			int input = 0;
			while (true) {
				displayCommandSelect();
				input = new java.util.Scanner(System.in).nextInt();
				if (input < 1 || input > 4) {
					System.out.println("不正な入力！");
				} else {
					break;
				}
			}
			this.reserveCommand = this.hasCommand[input - 1];

		} else { // enemyの処理
			int input = new java.util.Random().nextInt(4);
			this.reserveCommand = this.hasCommand[input];
		}
	}

	public void selectTarget(ArrayList<Character> allCharacters) {
		for (int i = 0; i < allCharacters.size(); i++) {
			System.out.print((i + 1) + "." + allCharacters.get(i).getName() + " ");
			int input;
			while (true) {
				input = new java.util.Scanner(System.in).nextInt();
				if (input < 1 || allEnemys.size() < input) {
					System.out.println("不正な入力です。");
				}
				break;
			}
			this.target = allEnemys.get(input - 1);
		}
	}

	public void setCommand(Command command) {
		this.reserveCommand = command;
	}

	public Command getAttack() {
		return this.hasCommand[0];
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

	public int getSkipTurn() {
		return skipSelect;
	}

	public void addSkipTurn(int num) {
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

	public void displayCommandSelect() {
		for (int i = 0; i < hasCommand.length; i++) {
			System.out.print((i + 1) + "." + hasCommand[i].getName() + " ");
		}
		System.out.print("　＞");
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
		if (this.camp == "p") {
			String SpDisplay = "";
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