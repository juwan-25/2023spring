package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean1 t1 = ctx.getBean("t1", TestBean1.class);
        System.out.println("data1 : "+t1.getData1());

        TestBean2 t2 = ctx.getBean("t2", TestBean2.class);
        TestBean2 t2_1 = ctx.getBean("t2", TestBean2.class);
        System.out.println("t2의 주소값 : "+t2);
        System.out.println("t2_1의 주소값 : "+t2_1);
        t2.pr_Method();

        TestBean3 t3 = ctx.getBean("t3", TestBean3.class);
        t3.pr_method2();

        TestBean4 t4= ctx.getBean("t4", TestBean4.class);
        t4.init();
        t4.destroy();

        ctx.close();

        System.out.println("-----------------------------------------------------------");

        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        TestBean1 java1 = ctx2.getBean("java1", TestBean1.class);

        /*TestBean2 java3 = ctx2.getBean("java2", TestBean2.class);
        * 이름을 바꾸었기 때문에 실행하면 에러 발생*/
        TestBean2 java2 = ctx2.getBean("a1", TestBean2.class);
        TestBean2 java2_1 = ctx2.getBean("a1", TestBean2.class);
        //Scope("prototype") : 매번 객체 생성
        System.out.println("java2의 주소값 : "+java2);
        System.out.println("java2_1의 주소값 : "+java2_1);
        java2.pr_Method();

        //Lazy : getBean할 때 객체 생성
        TestBean3 java3 = ctx2.getBean("java3", TestBean3.class);
        java3.pr_method2();

        ctx2.close();
    }
}