public class TrackCoach implements Coach {
    public TrackCoach(HappyFortuneService happyFortuneService) {
    }

    @Override
    public String getDailyWorkout(){
        return "Run a hard 5k";

    }

    @Override
    public String getDailyFortune() {
        return "Just do it! Today is your lucy day!";
    }
}
