package com.ninja.training;

import java.util.Scanner;

public class HWQS3_switch2 {

	public static void main(String[] args) {
		Scanner movie=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int movies=movie.nextInt();
		
		switch(movies) {
		
		case 1:
			System.out.println("first movie");
			break;
		case 8:
			System.out.println("last movie");
			break;
		default:
			System.out.println("Not first or last movie");
		}
		

	}

}
