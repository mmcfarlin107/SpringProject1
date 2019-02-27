package com.mikemcfarlin.springdemo1;

public class BaseBallCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Take 5 swings and run some laps";
	}
}
