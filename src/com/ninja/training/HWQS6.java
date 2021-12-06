package com.ninja.training;

import java.util.Scanner;

public class HWQS6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int totalmovies=8;
		String[] moviename= {"Harry Potter and the Philosopher's Stone", 
							"Harry Potter and the chamber of secrets",
							"Harry Potter and the Prisoner of Azkaban",
							"Harry Potter and the Goblet of fire",
							"Harry Potter and the Order of the Phoenix",
							"Harry Potter and the Half-Blood Prince",
							"Harry Potter and the Deathly Hallows-part 1",
							"Harry Potter and the Deathly Hallows-part 2"};
		int[] year= {2001, 2002, 2003, 2004, 2005 , 2006, 2007, 2008, 2009, 2010,2011};
		int[] order= {1,2,3,4,5,6,7,8};
		
		int[] n = new int[5];  
		System.out.println("Enter the numbers of the movies: ");  
		for(int i=0; i<5; i++)  
		{  
		//reading array elements from the user  	
		n[i]=sc.nextInt();  
		}  
	
		for(int position=0; position<5; position++) {
			System.out.println(order[n[position]-1]+") "+moviename[n[position]-1]+" |year of release: "+year[n[position]-1]);
		}

	}

}
