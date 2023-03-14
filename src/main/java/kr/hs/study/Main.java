package kr.hs.study;

import kr.hs.study.Beans.Jpop;
import kr.hs.study.Beans.Kpop;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Kpop kpop = ctx.getBean("k1", Kpop.class);
        Jpop jpop = ctx.getBean("j1", Jpop.class);

        kpop.sound();
        jpop.sound();

        ctx.close();
    }
}