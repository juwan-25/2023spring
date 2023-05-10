package kr.hs.study.config;

import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
// beans 패키지 아래에 있는 @ 붙인 클래스들 전부 bean 으로 만들어달라고 요청
public class BeanConfig {
    @Bean
    public DataBean2 java1(){
        return new DataBean2();
    }

    @Bean
    public DataBean2 java2(){
        return new DataBean2();
    }
}
