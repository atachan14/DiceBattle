package main;

import java.util.ArrayList;

import commands.*;

public class Execute {
	DBM diceBattleManager;
	ArrayList<Character> allPlayers;
	ArrayList<Character> allEnemys;
	ArrayList<Character> allCharacters;

	public Execute(DBM dbm) {
		this.diceBattleManager = dbm;
		this.allPlayers = dbm.allPlayers;
		this.allEnemys = dbm.allEnemys;
		this.allCharacters = dbm.allCharacters;
	}

	public void priority1Fase() {
		for (Character chara : allCharacters) {
			if (chara.hasCommand[chara.getCommandInput()].getPriority() == 1) {
				chara.hasCommand[chara.getCommandInput()].exe();
			}
		}
	}

	public void priority2Fase() {
		for (Character chara : allCharacters) {
			if (chara.hasCommand[chara.getCommandInput()].getPriority() == 2) {
				chara.hasCommand[chara.getCommandInput()].exe();
			}
		}
	}

	public void allPlayerAbnomalCountDown() {
		for (Character chara : allCharacters) {
			chara.allAbnomalCountDown();
		}
	}

	public void autoTargetSet() {
		if (allEnemys.size() == 1) {
			for (Character player : allPlayers) {
				player.setTarget(allEnemys.get(0));
			}
		}
		if (allPlayers.size() == 1) {
			for (Character enemy : allEnemys) {
				enemy.setTarget(allPlayers.get(0));
			}
		}
	}
}
