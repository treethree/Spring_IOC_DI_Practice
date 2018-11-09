package com.springdemo;

public class MyApp {

	public static void main(String[] args) {
		Coach theCoach = new TrackCoach();
		
		//cause we create interface this line will work with any kinds of coach
		System.out.println(theCoach.getDailyWorkout());
		
	}

}
