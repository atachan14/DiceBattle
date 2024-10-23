package dice_battle;

public class Display extends DiceBattleManager {

	public void opening() {
		System.out.println("-----------------------");
		System.out.println(player.name + "(HP." + player.hp + ",SP." + player.sp);
		System.out.println(" 　vs");
		System.out.println(enemy.name + "(HP." + enemy.hp);
		System.out.println("-----------------------");
	}

	public void turnOfPlayer() {
		System.out.println(turnCount+"ターン目");
		System.out.println("---------------");
		System.out.println("【" + player.name + "】");
		System.out.println("HP:" + player.hp);
		System.out.print("SP:");
		spDisplay();
		System.out.println("攻撃力:" + player.ap);
		System.out.println("命中率:" + player.hitPer);
		System.out.println("防御力:" + player.avoidPer);
		System.out.println();
		System.out.println("【" + enemy.name + "】");
		System.out.println("HP:" + enemy.hp);
		System.out.println("攻撃力:" + enemy.ap);
		System.out.println("命中率:" + enemy.hitPer);
		System.out.println("防御力:" + enemy.avoidPer);
		System.out.println("1.攻撃 2.防御 3.強打 4.精密");

	}

	public void spDisplay() {
		for (int i = 0; i < player.sp; i++) {
			System.out.print("●");
		}
		for (int i = 0; i < player.maxSp - player.sp; i++) {
			System.out.print("〇");
		}
	}

	
}