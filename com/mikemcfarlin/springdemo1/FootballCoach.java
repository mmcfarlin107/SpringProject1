package com.mikemcfarlin.springdemo1;

public class FootballCoach implements Coach {
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout(){
		return "Do some lifting for the combines";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
