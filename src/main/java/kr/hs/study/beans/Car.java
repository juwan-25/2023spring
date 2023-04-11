package kr.hs.study.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Car {
    private int year;
    private String model;

    public Car(int year, String model) {
        this.year = year;
        this.model = model;
    }

    public void print3(){
        System.out.println("자동차 출발");
    }
}
