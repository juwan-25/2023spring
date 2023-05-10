package kr.hs.study;

import kr.hs.study.beans.CircleBean;
import kr.hs.study.beans.EOSumBean;
import kr.hs.study.beans.SumBean;
import kr.hs.study.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

        //문제 1
        SumBean s1 = ctx.getBean("sum1", SumBean.class);
        s1.sumTo();

        SumBean s2 = ctx.getBean("sum2", SumBean.class);
        s2.sumTo();
        System.out.println();
        System.out.println();


        //문제2
        EOSumBean s3 = ctx.getBean("sum3", EOSumBean.class);
        s3.eoPrint();
        System.out.println();

        EOSumBean s4 = ctx.getBean("sum4", EOSumBean.class);
        s4.eoPrint();
        System.out.println();
        System.out.println();

        //문제 3
        CircleBean s5 = ctx.getBean("sum5", CircleBean.class);
        s5.print();

        CircleBean s6 = ctx.getBean("sum6", CircleBean.class);
        s6.print();

        ctx.close();
    }
}