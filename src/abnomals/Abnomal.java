package abnomals;

import characters.Character;

public abstract class Abnomal {
	String name;
	Character owner;
	Character from;
	int turn = 0;
	int num = 0;
	boolean buff;
	String type ="";

	public Abnomal(Character owner, Character from, int turn, int num) {
		this.owner = owner;
		this.from = from;
		this.turn = turn;
		this.num = num;
	}

	public void cured() {
		curedEffect();
		curedMesse();
	}

	public void curedEffect() {
		System.out.println("default curedEffect");
	}
	
	
	public void curedMesse() {
		System.out.print("・");
		if (buff) {
			System.out.println(owner.getName() + "の" + name + "状態が終わった！");
		}else {
			System.out.println(owner.getName()+"は"+name+"から回復した！");
		}
	}
	
	public void inTheMiddle() {
		inTheMiddleMesse();
	}
	
	public void inTheMiddleMesse() {
		System.out.print("・");
		if(owner == from) {
		System.out.println(owner.getName()+"は"+name+"状態だ！(残り"+turn+"ターン）");
		}
		if(owner != from) {
			System.out.println(owner.getName()+"は"+from.getName()+"の"+name+"を受けている！(残り"+turn+"ターン）");
		}
	}
	
	public String typeName() {
		if (buff) {
			return "バフ";
		} else {
			return "デバフ";
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getTurn() {
		return turn;
	}
	
	public void addTurn(int num) {
		turn += num;
	}
}
