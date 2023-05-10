package kr.hs.study.config;

import kr.hs.study.beans.Car;
import kr.hs.study.beans.Train;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("kr.hs.study.beans")
public class BeanConfig {
    @Bean
    public Car car(){
        return new Car(22, "KIA");
    }

    @Bean
    public Train train(){
        return new Train(23, 100.13, "KTX");
    }
}
