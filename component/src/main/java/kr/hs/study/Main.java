package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean1 t1 = ctx.getBean(TestBean1.class);

        TestBean2 t2 = ctx.getBean(TestBean2.class);
        System.out.println(t2.getData1()+" "+t2.getData2());
        ctx.close();
    }
}