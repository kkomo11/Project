package com.kkomo.tictactoe;

import java.util.Random;

public class Util {
	Random rand = new Random();
	public boolean firstCheck() {
		boolean check=true;
		int num = rand.nextInt(2);
		if(num==1) {
			check = !check;
		}
		return check;
	}
}