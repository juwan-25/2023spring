package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        //생성자 주입
        TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
        obj1.prData();
        TestBean1 obj2 = ctx.getBean("t2", TestBean1.class);
        obj2.prData();
        TestBean1 obj3 = ctx.getBean("t3", TestBean1.class);
        obj3.prData();
        TestBean1 obj4 = ctx.getBean("t4", TestBean1.class);
        obj4.prData();

        //객체 주입
        TestBean2 obj5 = ctx.getBean("t5", TestBean2.class);
        obj5.prData();

        ctx.close();
    }
}