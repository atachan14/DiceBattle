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

	final int DEFAULT_HIT_PER = 50;
	final int DEFAULT_AVOID_PER = 50;

	ArrayList<Abnomal> hasAbnomal = new ArrayList<Abnomal>();
	boolean suvive = true;
	int command = 0;

	public Character() {
	}

	public void attack(Character taget) {
		System.out.println(name + "は攻撃した！");
	}

	public void attack(Character taget, int bonus) {
		System.out.println(name + "は攻撃した！");
	}

	public void defense() {
		System.out.println(name + "は防御した！");
		hasAbnomal.add(new Defensed(this, 1, 30));
	}

	public void avoidDebuf() {

	}

}