public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    private FortuneService fortuneService;

    public CricketCoach(HappyFortuneService happyFortuneService) {
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    //our setter method
    public void setFortuneService(FortuneService fortuneService){
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }
}
