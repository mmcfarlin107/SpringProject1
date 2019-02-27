package com.mikemcfarlin.springdemo1;

public class BaseBallCoach implements Coach {
	
	//defining the private field for the dependency 
	private FortuneService fortuneService;
	
	
	//defining the constructor for the dependency injection
	public BaseBallCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	//Using the dependency to return the Fortune
	//for us
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@Override
	public String getDailyWorkout() {
		return "Take 5 swings and run some laps";
	}
	

}
