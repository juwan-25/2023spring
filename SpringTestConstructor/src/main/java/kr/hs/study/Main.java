package kr.hs.study;

import kr.hs.study.beans.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        System.out.println("문제1");
        Order q1 = ctx.getBean("q1", Order.class);
        q1.prData();
        System.out.println();

        System.out.println("문제2");
        SumAverage q2 = ctx.getBean("q2", SumAverage.class);
        System.out.println("합계 : "+q2.sum());
        System.out.println("평균 : "+q2.avg());
        System.out.println();

        System.out.println("문제3");
        Compare q3 = ctx.getBean("q3", Compare.class);
        q3.prCom();
        System.out.println();

        System.out.println("문제4");
        Even q4= ctx.getBean("q4", Even.class);
        q4.prEven();
        System.out.println();

        System.out.println("문제5");
        Digit q5= ctx.getBean("q5", Digit.class);
        q5.prDig();
        System.out.println();


        System.out.println("문제6");
        Tri q6= ctx.getBean("q6", Tri.class);
        q6.prTri();
        System.out.println();

        System.out.println("문제7");
        Score q7= ctx.getBean("q7", Score.class);
        q7.prScore();
        System.out.println();

        System.out.println("문제8");
        sMaxMIn q8= ctx.getBean("q8", sMaxMIn.class);
        q8.prMaxMin();
        System.out.println();

        System.out.println("문제9");
        SumAvg20to50 q9= ctx.getBean("q9", SumAvg20to50.class);
        q9.prSumAvg();
        System.out.println();

        ctx.close();
    }
}