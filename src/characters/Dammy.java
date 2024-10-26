package characters;

import commands.ChargeForAttack;

public class Dammy extends Character{
	ChargeForAttack chargeAttack = new ChargeForAttack(this);
	
	public Dammy(){
		this.name = "ダミー";
		this.camp = "e";
		this.sp = 4;
		
		hasCommand[0] = chargeAttack;
		hasCommand[1] = chargeAttack;
		hasCommand[2] = chargeAttack;
		hasCommand[3] = chargeAttack;
	}
}
