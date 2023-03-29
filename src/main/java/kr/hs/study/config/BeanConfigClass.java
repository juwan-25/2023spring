package kr.hs.study.config;
//스프링에게 객체 생성 요청하는 파일

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfigClass {
    @Bean
    TestBean1 java1(){
        TestBean1 t = new TestBean1();
        return t;
    }

    @Bean(name="a1")
    @Scope("prototype")
    TestBean2 java2(){
        return new TestBean2();
    }

    @Bean
    @Lazy
    TestBean3 java3(){
        return new TestBean3();
    }


}
