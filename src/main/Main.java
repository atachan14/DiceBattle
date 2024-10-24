package main;
/*ゲーム名：ダイスバトル
行動の成否をダイスによって行うRPGのターン制バトル風ゲーム。
９章までの内容で作ることができます。

【ルール】
１．バトルは１ｖ１で行う
２．ターン毎に行動を選択し、その結果を処理する
３．どちらかが倒れるまで戦闘を続行する
４．倒せばゲームクリア、倒れたらゲームーオーバー

【キャラクターの持つ要素】
・名前：キャラクターの名前
・ＨＰ：キャラクターの体力
・ＳＰ：キャラクターがスキルを使うために必要なポイント。ターン毎に１溜まる
・攻撃力：キャラクターが相手に与えるダメージ値
・命中力：キャラクターが攻撃を命中させやすくなる値
・防御力：キャラクターが攻撃を避けやすくなる値

【プレイヤーの出来る行動】
・攻撃：相手にダメージを与える
・防御：そのターンの相手の攻撃を避けやすくなる
・強打：ＳＰを消費し、ダメージの増えた「攻撃」を行う
・精密：ＳＰを消費し、ｎターンの間、命中力を上昇させる（既にかかっている場合、ターン数をリセットする。累積しない）

【エネミーの出来る行動】
下記の行動をランダムに行う（ＳＰが足りない場合はＳＰを消費する行動を行わない）
・攻撃：相手にダメージを与える
・防御：そのターンの相手の攻撃を避けやすくなる
・溜め攻撃：ＳＰを消費し、１ターン待機後、ダメージの増えた「攻撃」を行う。（溜めていることをプレイヤーに通知する）
・妨害：ＳＰを消費し、ｎターンの間、相手の防御力を低下させる（既にかかっている場合、ターン数をリセットする。累積しない）

【処理について】
相手に攻撃を行った場合、その成否は２Ｄ６（６面ダイス２個）によって左右される。
攻撃側の「２Ｄ６＋命中力」と防御側の「２Ｄ６＋防御力」で対決し、攻撃側が高ければ攻撃成功となり、ダメージを与える。
同値の場合は「受動優先」とし、防御側の勝利とする。
それ以外の行動については自動的に成功するものとする。

【表示について】
・プレイヤーの名前とＨＰとＳＰを表示する
・エネミーの名前とＨＰを表示する
・それぞれが何の行動をしたのか表示する
・ダイスロールの結果を表示する
・行動の結果を表示する
・上記以外で表示した方がいいと思ったものを表示してもよい

実行例）２Ｄ６＋命中（防御）値を表示する
【ダイスロール】
攻撃側：9＋5＝14
防御側：5＋3＝8

【追記】
動作に問題がなければ以下のことに挑戦する
・プレイヤーの行動を追加する（複数回攻撃、回復など）
・エネミーの行動を追加する
*/

public class Main {

	public static void main(String[] args) {
		System.out.print("DiceBattle 	1.play 2.end　＞");
		startDisplay();

	}

	public static void startDisplay() {
		int input = new java.util.Scanner(System.in).nextInt();
		switch (input) {
		case 1:
			DBM dbm = new DBM();
			dbm.inPlay();
			break;
		case 2:
			endDisplay();
			break;
		}
	}

	public static void endDisplay() {
		System.out.println("DiceBattleを終了します。");
	}
}