package kr.hs.study.beans;

import lombok.Data;

@Data
public class sMaxMIn {
    private int num1;
    private int num2;
    private int num3;
    private int num[];

    public void prMaxMin(){
        num = new int[]{num1, num2, num3};
        int max = num[0];
        int min = num[0];

        for(int i=1; i<num.length; i++){
            if(max < num[i]) max=num[i];
            else if(min>num[i]) min=num[i];
        }

        System.out.println("최대점수 : "+max);
        System.out.println("최소점수 : "+min);
    }
}
