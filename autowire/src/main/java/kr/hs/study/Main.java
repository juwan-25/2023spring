package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean1 t1 = ctx.getBean("t1", TestBean1.class);
        System.out.println("data1 : "+t1.getData1());
        System.out.println("data2 : "+t1.getData2());

        ctx.close();
    }
}