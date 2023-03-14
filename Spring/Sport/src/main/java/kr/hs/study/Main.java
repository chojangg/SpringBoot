package kr.hs.study;

import kr.hs.study.beans.BaseBall;
import kr.hs.study.beans.Sports;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("config.xml");
        BaseBall sport1 = ctx.getBean("s1", BaseBall.class);

        System.out.print("경기 종목 : ");
        sport1.getName();
        System.out.println();
        System.out.print("선수 인원 : ");
        sport1.getPlayer();
        System.out.println();
        System.out.print("경기 규칙 : ");
        sport1.rule();

        


    }
}