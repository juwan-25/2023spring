package kr.hs.study.beans;

public class SumAverage {
    private int num1;
    private int num2;
    private int num3;

    SumAverage(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;

    }

    public int sum(){
        return (num1+num2+num3);
    }

    public double avg(){
        return sum()/3.0;
    }



}
