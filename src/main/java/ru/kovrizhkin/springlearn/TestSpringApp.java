package ru.kovrizhkin.springlearn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        SoFuckingBigJetToMostTripInMyLife jet = context.getBean("jetBean", SoFuckingBigJetToMostTripInMyLife.class);
        jet.letsFly();

        context.close();
    }
}
