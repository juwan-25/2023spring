package kr.hs.study;

import kr.hs.study.Beans.Jpop;
import kr.hs.study.Beans.Kpop;
import kr.hs.study.Beans.Music;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Music kpop = ctx.getBean("k1", Music.class);
        Music jpop = ctx.getBean("j1", Music.class);

        kpop.sound();
        jpop.sound();

        ctx.close();
    }
}