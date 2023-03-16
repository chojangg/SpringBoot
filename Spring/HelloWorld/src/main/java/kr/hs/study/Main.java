package kr.hs.study;

import kr.hs.study.beans.Hello;
import kr.hs.study.beans.HelloWorldEn;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.jvm.hotspot.HelloWorld;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Hello h1 = ctx.getBean("h1", HelloWorld.class);




        System.out.println("Hello world!");
    }
}