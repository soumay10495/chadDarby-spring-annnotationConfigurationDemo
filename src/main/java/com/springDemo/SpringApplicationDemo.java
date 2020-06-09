package com.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
//@ComponentScan("com.springDemo")
public class SpringApplicationDemo {

    public static void main(String args[]) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(SpringApplicationDemo.class);

        //Coach coach = annotationConfigApplicationContext.getBean("sporCoach", SportCoach.class);
        Coach coach = annotationConfigApplicationContext.getBean(SportCoach.class);
        SportCoach coach1 = annotationConfigApplicationContext.getBean(SportCoach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach1.getFortune());
        System.out.println(coach1.getName());
        System.out.println(coach1.getEmail());

        annotationConfigApplicationContext.close();
    }

    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public Coach sportCoach() {
        return new SportCoach(sadFortuneService());
    }
}
