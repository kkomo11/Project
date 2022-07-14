package com.kkomo.tictactoe;

import java.util.Random;
import java.util.Scanner;

public class Util {
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);
	MakeField makeField = new MakeField();
	
	int position;
	public boolean firstCheck() {
		boolean check=true;
		int num = rand.nextInt(2);
		if(num==1) {
			check = !check;
		}
		return check;
	}
	
	public void playerTurn() { // 이미 놓은 번호라면 재입력
		boolean flag = true;
		
		while(flag) {
			System.out.println("놓을 곳을 입력하세요");
			position = sc.nextInt();
			if(makeField.pos[position-1] == " ") {
				makeField.pos[position-1] = "O";
				makeField.makeField();
				break;
			}
		}
	}
	
	public void player2Turn() { // 이미 놓은 번호라면 재입력
		boolean flag = true;
		
		while(flag) {
			System.out.println("놓을 곳을 입력하세요");
			position = sc.nextInt();
			if(makeField.pos[position-1] == " ") {
				makeField.pos[position-1] = "X";
				makeField.makeField();
				break;
			}
		}
	}
	
	public void computerTurn() { // 이미 놓은 번호라면 다시 랜덤
		
	}
	
	// P1이 놓은 자리 배열, P2가 놓은 자리 배열
	// 각 배열에서 승리의 경우의 수 찾기
	public boolean winOrLose() {
		boolean result=true;
		return result;
	}
}