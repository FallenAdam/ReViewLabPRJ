import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
//        Coach theCoach = context.getBean("myCoach",Coach.class);
//        String messageFromTheCoach = theCoach.getDailyWorkout();
//        System.out.println(messageFromTheCoach);
//
//        Coach theSecondCoach = context.getBean("myCoach2",Coach.class);
//        System.out.println(theSecondCoach.getDailyWorkout());
        FortuneService serviceMine = context.getBean("myService",HappyFortuneService.class);
        System.out.println(serviceMine.getFortune());
        context.close();

    }
}