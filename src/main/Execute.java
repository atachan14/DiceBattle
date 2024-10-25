package main;

import characters.Character;

public class Execute {
	DBM dbm;

	public Execute(DBM dbm) {
		this.dbm = dbm;
	}

	public void stanbyFase() {
		allCharactersAbnomalCountDown();
	}

	public void selectFase() {
		for (Character chara : dbm.allCharacters) {
			if (chara.getSkipTurn() > 0) {
				chara.addSkipTurn(-1);
				dbm.reserveCommands.add(chara.getReserveCommand());
				continue;
			}
			chara.selectCommand();
			dbm.reserveCommands.add(chara.getReserveCommand());
		}
	}

	public void priority1Fase() {
		for (int i = 0; i < dbm.reserveCommands.size(); i++) {
			if (dbm.reserveCommands.get(i).getPriority() == 1) {
				dbm.reserveCommands.get(i).exe();
				dbm.reserveCommands.remove(i);
				i--;
			}
			System.out.println();
		}
	}

	public void priority2Fase() {
		for (int i = 0; i < dbm.reserveCommands.size(); i++) {
			if (dbm.reserveCommands.get(i).getPriority() == 2) {
				dbm.reserveCommands.get(i).exe();
				dbm.reserveCommands.remove(i);
				i--;
			}
			System.out.println();
		}
	}

	public void priority3Fase() {
		for (int i = 0; i < dbm.reserveCommands.size(); i++) {
			if (dbm.reserveCommands.get(i).getPriority() == 3) {
				dbm.reserveCommands.get(i).exe();
				dbm.reserveCommands.remove(i);
				i--;
			}
		}
	}
	
	public void endFase() {
		allCharactersSuviveCheck();
//		allCharactersSpRecovery();
	}

	public void allCharactersSuviveCheck() {
		for (int i = 0;i<dbm.allCharacters.size();i++) {
			if (dbm.allCharacters.get(i).getHp() < 0) {
				dbm.allCharacters.get(i).dyingMesse();
				dbm.allCharacters.remove(i);
				i--;
			}
		}
	}

	public void allCharactersAbnomalCountDown() {
		for (Character chara : dbm.allCharacters) {
			chara.allAbnomalCountDown();
		}
	}

	public void allCharactersSpRecovery() {
		for (Character chara : dbm.allCharacters) {
			if (chara.getSp() < chara.getMaxSp()) {
				chara.addSp(1);
			}
		}
	}

	public void autoTargetSet() {
		if (dbm.allEnemys.size() == 1) {
			for (Character player : dbm.allPlayers) {
				player.setTarget(dbm.allEnemys.get(0));
			}
		}
		if (dbm.allPlayers.size() == 1) {
			for (Character enemy : dbm.allEnemys) {
				enemy.setTarget(dbm.allPlayers.get(0));
			}
		}
	}
}
