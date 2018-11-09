package com.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5K!";
	}

	@Override
	public String getDailyFortune() {
		return "just do it" + fortuneService.getFortune();
	}
	
	public void doMyStartupStuff() {
		System.out.print("TrackCoach: inside method doMyStartupStuff");
	}
	
	public void doMyCleanupStuffYoYo() {
		System.out.print("TrackCoach: inside method doMyCleanupStuffYoYo");
	}

}
