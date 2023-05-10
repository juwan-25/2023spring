package hs.kr.study;

import hs.kr.study.beans.Sports;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Sports b = ctx.getBean("baseball", Sports.class);
        b.Sports("baseball", 5);

        System.out.println("경기 종목 : "+b.getName());
        System.out.println("경기 인원 : "+b.getPlayer()+"명");
        System.out.print("경기 규칙 : ");
        b.rule();
    }
}