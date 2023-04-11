package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

        TestBean1 data1 = ctx.getBean(TestBean1.class);

        System.out.println(data1.getData1().getYear()+"년 출시 "+data1.getData1().getModel()+"모델");
        data1.getData1().print3();

        System.out.println(data1.getData2().getYear()+"년 출시 "+data1.getData2().getModel()+"모델 "+data1.getData2().getSpeed()+"km/h 최대속도");
        data1.getData2().print1();
        data1.getData2().print2();

        ctx.close();
    }
}