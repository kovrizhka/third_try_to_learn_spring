package ru.kovrizhkin.springlearn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        SuperBean bean = (SuperBean) context.getBean("testBean");
        System.out.println(bean.getWish());
        context.close();
    }
}
