package kr.hs.study;

import kr.hs.study.beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean obj1 = ctx.getBean("t1", TestBean.class);
        System.out.println("obj1: "+obj1);

        System.out.println("---------------------------------------------");
        TestBean obj2 = ctx.getBean("t3", TestBean.class);
        System.out.println("obj2: "+obj2);



        ctx.close();
        System.out.println("Hello world!");
    }
}