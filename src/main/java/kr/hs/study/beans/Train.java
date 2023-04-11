package kr.hs.study.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Train {
    private int year;
    private double speed;
    private String model;

    public Train(int year, double speed, String model) {
        this.year = year;
        this.speed = speed;
        this.model = model;
    }

    public void print1(){
        System.out.println("기차 출발");
    }
    public void print2(){
        System.out.println("기차 도착");
    }

}
