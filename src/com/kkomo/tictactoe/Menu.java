package com.kkomo.tictactoe;

import java.util.Scanner;

public class Menu {
	private int difficulty=1;
	View view = new View();
	Game game = new Game();
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		boolean check=true;
		while(check) {
			view.Start(difficulty);
			int menu = sc.nextInt();
			if(menu == 1) {
				game.game(difficulty);
				check = !check;
			} else if(menu == 2) {
				System.out.println("난이도 설정");
				difficulty = sc.nextInt();
			} else {
				check = !check;
			}
		}
	}
}