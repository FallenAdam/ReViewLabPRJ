import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach myCoach = context.getBean("myCoach",TrackCoach.class);
        System.out.println(myCoach.getDailyFortune());
        System.out.println(myCoach.getDailyWorkout());
        context.close();

    }
}