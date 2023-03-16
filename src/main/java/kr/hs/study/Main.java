package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
        obj1.prData();

        ctx.close();
    }
}