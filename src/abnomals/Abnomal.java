package abnomals;

import main.Character;

public abstract class Abnomal {
	String name;
	Character owner;
	int turn = 0;
	int num = 0;
	boolean buff;

	public Abnomal(Character owner, int turn, int num) {
		this.owner = owner;
		this.turn = turn;
		this.num = num;
	}

	public void cured(Abnomal abnomal) {
		owner.removeHasAbnomal(abnomal);
	}
	
	public void sickMesse() {
		System.out.println(owner + "は" + name + "の" + typeName() + "を受けている！（残り" + turn + ")");
	}

	public String typeName() {
		if (buff) {
			return "バフ";
		} else {
			return "デバフ";
		}
	}

	public void curedMesse() {
		if (buff) {
			System.out.println(owner + "の" + name + "が終わった・・・");
		}else {
			System.out.println(owner+"は"+name+"から回復した・・・");
		}
	}
	
	public void addTurn(int num) {
		turn += num;
	}
}
