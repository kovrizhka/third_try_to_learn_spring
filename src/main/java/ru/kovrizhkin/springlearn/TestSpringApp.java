package ru.kovrizhkin.springlearn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Voyage voyage = (Voyage) context.getBean("tripBean");

        SoFuckingBigJetToMostTripInMyLife jet = new SoFuckingBigJetToMostTripInMyLife(voyage);

        jet.letsFly();

        context.close();
    }
}
