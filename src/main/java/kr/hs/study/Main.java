package kr.hs.study;

import kr.hs.study.beans.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Person obj1 = ctx.getBean("t1", Person.class);
        obj1.pp();


    }
}