package kr.hs.study.beans;

import lombok.Data;

@Data
public class SumAverage {
    private int num1;
    private int num2;
    private int num3;


    public int sum(){
        return (num1+num2+num3);
    }

    public double avg(){
        return sum()/3.0;
    }



}
