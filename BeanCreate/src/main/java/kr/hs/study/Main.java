package kr.hs.study;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        TestBean t1 = new TestBean();

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        TestBean obj1 = ctx.getBean("t1", TestBean.class);
        System.out.println("obj1 : "+obj1);

        TestBean2 obj2 = ctx.getBean("t2", TestBean2.class);
        System.out.println("obj2 : "+obj2);

        TestBean obj3 = ctx.getBean("t3", TestBean.class);
        System.out.println("obj3 : "+obj3);

        TestBean obj4 = ctx.getBean("t3", TestBean.class);
        System.out.println("obj4 : "+obj4);

        ctx.close();
    }

}