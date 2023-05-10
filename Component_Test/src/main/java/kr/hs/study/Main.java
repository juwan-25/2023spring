package kr.hs.study;

import kr.hs.study.beans.Member;
import kr.hs.study.beans.Person;
import kr.hs.study.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

        Member m1 = ctx.getBean(Member.class);
        System.out.println(m1.getP1().getName()+"/"+m1.getP1().getAge()+"/"+m1.getP1().getNickname());
        m1.getP1().go();
        System.out.println(m1.getP2().getName()+"/"+m1.getP2().getAge()+"/"+m1.getP2().getNickname());
        m1.getP2().go();
        ctx.close();
    }
}