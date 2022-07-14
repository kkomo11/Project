package com.kkomo.tictactoe;

public class Game {
	MakeField mf = new MakeField();
	Util util = new Util();
	
	public void game(int difficulty) {
		boolean check; boolean flag = true;
		if(difficulty == 1) {
			System.out.println("난이도 1");
			check = util.firstCheck();
			mf.makeField();
			while(flag) {
				if(check) { // 플레이어1 공격
					util.playerTurn();
					check = !check;
				} else { // 플레이어2 공격
					util.player2Turn();
					check = !check;
				}
				// 승패체크
				// 둘 곳 없는지 체크
			}
			
		} else if(difficulty == 2) {
			System.out.println("난이도 2");
			check = util.firstCheck();
			mf.makeField();
		} else {
			System.out.println("난이도 3");
			check = util.firstCheck();
			mf.makeField();
		}
	}
}