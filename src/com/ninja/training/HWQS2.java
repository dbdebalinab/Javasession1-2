package com.ninja.training;

public class HWQS2 {
	public static void main(String args[]) {
		
		int firstmovieyr =2001;
		int lastmovieyr = 2011;
		int timelapsed = (lastmovieyr-firstmovieyr);
		int totalmovies = 8;
		int monthsinyear =12;
		int approxmovieinmnth= (timelapsed*monthsinyear)/totalmovies;
		int approxmovieinyr = approxmovieinmnth/monthsinyear;
		int approxmovieinmnth2 =approxmovieinmnth%monthsinyear;
		
		System.out.println("The approx years for a movie release "+approxmovieinyr
							+" year and "+approxmovieinmnth2+ " months.");
	}
	
}

	