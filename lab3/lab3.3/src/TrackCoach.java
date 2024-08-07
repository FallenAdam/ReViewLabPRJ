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

    @Override
    public String getEmailAddress() {
        return "";
    }

    @Override
    public String getTeam() {
        return "";
    }
    public void eat() {
        System.out.println("Track coach eats");
    }
    public void sleep() {
        System.out.println("Track coach sleeps");
    }
}
