package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

        TestBean1 java1 = ctx.getBean("java1", TestBean1.class);

        // 생성자 DI
        TestBean2 java2 = ctx.getBean("ex", TestBean2.class);
        System.out.println(java2.getData1()+" "+java2.getData2()+" "+java2.getData3());

        // setter DI
        TestBean2 java3 = ctx.getBean("java3", TestBean2.class);
        System.out.println(java3.getData1()+" "+java3.getData2()+" "+java3.getData3());

        //init, destroy method
        TestBean3 java4 = ctx.getBean("java4", TestBean3.class);

        ctx.close();
    }
}