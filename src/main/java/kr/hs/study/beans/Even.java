package kr.hs.study.beans;

import lombok.Data;

@Data
public class Even {
    private int num1;
    private int num2;
    private int num3;
    private int num[];


    public void prEven(){
        num = new int[]{num1, num2, num3};
        for(int i=0; i<num.length; i++){
            if(num[i]%2==0) System.out.print(num[i]+" ");
        }
    }
}
