package kr.hs.study.config;

import kr.hs.study.beans.CircleBean;
import kr.hs.study.beans.EOSumBean;
import kr.hs.study.beans.SumBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public SumBean sum1(){
        SumBean s = new SumBean();
        s.setN(3);
        s.setM(8);
        return s;
    }

    @Bean
    public SumBean sum2(){
        SumBean s = new SumBean(4,10);
        return s;
    }

    @Bean
    public EOSumBean sum3(){
        EOSumBean s = new EOSumBean();
        s.setN(3);
        s.setCh('e');
        return s;
    }

    @Bean
    public EOSumBean sum4(){
        EOSumBean s = new EOSumBean(7, 'o');
        return s;
    }

    @Bean
    public CircleBean sum5(){
        CircleBean s = new CircleBean();
        s.setNum(1);
        s.setR(5);
        s.setW(8);
        return s;
    }

    @Bean
    public CircleBean sum6(){
        CircleBean s = new CircleBean(2, 3, 4);
        return s;
    }
}
