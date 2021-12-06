package com.ninja.training;

import java.util.Scanner;

public class HWQS3_switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int movies=sc.nextInt();
		
		switch(movies) {
		
		case 1:
			System.out.println("Harry Potter and the Philosopher's Stone ");
			break;
		case 2:
			System.out.println("Harry Potter and the chamber of secrets");
			break;
		case 3:
			System.out.println("Harry Potter and the Prisoner of Azkaban");
			break;
		case 4:
			System.out.println("Harry Potter and the Goblet of fire");
			break;
		case 5:
			System.out.println("Harry Potter and the Order of the Phoenix");
			break;
		case 6:
			System.out.println("Harry Potter and the Half-Blood Prince ");
			break;
		case 7:
			System.out.println("Harry Potter and the Deathly Hallows-part 1");
			break;
		case 8:
			System.out.println("Harry Potter and the Deathly Hallows-part 2");
			break;
		}
		

	}

}
