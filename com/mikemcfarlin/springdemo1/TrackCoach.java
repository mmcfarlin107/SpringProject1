package com.mikemcfarlin.springdemo1;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a 5k (10k if you feel ambitious)";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
