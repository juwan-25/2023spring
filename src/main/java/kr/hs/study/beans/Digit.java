package kr.hs.study.beans;

public class Digit {
    private int num1;

    Digit(int num1){
        this.num1 = num1;
    }

    public void prDig(){
        if(num1%10==num1/10) System.out.println("같음");
        else System.out.println("다름");
    }
}
