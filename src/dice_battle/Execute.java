package dice_battle;

public class Execute extends DiceBattleManager{
	
	
	public void countJudge() {
		if(enemy.chargeCount==1) {
			enemy.chargeCount--;
			enemy.selectSkip();
		}
	}
	
	public void defenseFase(Character[] allCharacter) {
		for(Character chara: allCharacter) {
			if(chara.command ==2) {
				chara.defense();
			}
			
		}
		
	}

}
