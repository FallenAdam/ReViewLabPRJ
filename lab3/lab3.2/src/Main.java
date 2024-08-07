import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach myCoach = context.getBean("myCoach",Coach.class);
        Coach theCoach = context.getBean("myCoach",Coach.class);
        boolean same = myCoach.equals(theCoach);
        System.out.println("Coach: " + myCoach);
        System.out.println("Coach: " + theCoach);
        System.out.println("same: " + same);
        context.close();

    }
}