package com.mikemcfarlin.springdemo1;

public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout(){
		return "Do some lifting for the combines";
	}
}
