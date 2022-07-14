package com.kkomo.tictactoe;

public class MakeField {
	String[] pos = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
	
	public void makeField() {
		System.out.println();
		System.out.println("  "+pos[0]+" | "+pos[1]+" | "+pos[2]+"  ");
		System.out.println(" ---|---|---");
		System.out.println("  "+pos[3]+" | "+pos[4]+" | "+pos[5]+"  ");
		System.out.println(" ---|---|---");
		System.out.println("  "+pos[6]+" | "+pos[7]+" | "+pos[8]+"  ");

	}
	
	public void makeField(int position) {
		System.out.println();
		System.out.println("  "+pos[0]+" | "+pos[1]+" | "+pos[2]+"  ");
		System.out.println(" ---|---|---");
		System.out.println("  "+pos[3]+" | "+pos[4]+" | "+pos[5]+"  ");
		System.out.println(" ---|---|---");
		System.out.println("  "+pos[6]+" | "+pos[7]+" | "+pos[8]+"  ");

	}
}