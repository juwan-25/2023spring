package kr.hs.study.beans;

import lombok.Data;

@Data
public class Digit {
    private int num1;

    public void prDig(){
        if(num1%10==num1/10) System.out.println("같음");
        else System.out.println("다름");
    }
}
