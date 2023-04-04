package kr.hs.study.config;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

// 객체를 만들어달라고 요청하는 설정파일
@Configuration
public class BeanConfig {
    // TestBean1 객체 생성
    @Bean
    public TestBean1 java1(){
        TestBean1 t = new TestBean1();
        return t;
    }

    @Bean(name="ex")
    public TestBean2 java2(){
        TestBean2 t = new TestBean2(323, "런쥔", 3.23);
        return t;
    }

    @Bean
    @Lazy
    @Scope("prototype")
    public  TestBean2 java3(){
        TestBean2 t = new TestBean2();
        t.setData1(323);
        t.setData2("런쥔");
        t.setData3(3.23);
        return t;
    }

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public TestBean3 java4(){
        TestBean3 t = new TestBean3();
        return t;
    }
}
