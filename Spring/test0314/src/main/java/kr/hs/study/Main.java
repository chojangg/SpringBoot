package kr.hs.study;

import kr.hs.study.beans.Music;
import kr.hs.study.beans.kpop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("config.xml");
        kpop obj1 = ctx.getBean("m1", kpop.class);
        Music obj2 = ctx.getBean("m1", Music.class);
        obj2.sound();
    }
}