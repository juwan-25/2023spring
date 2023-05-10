package kr.hs.study.beans;

import lombok.Data;

@Data
public class SumAvg20to50 {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;
    private int num[];
    int sum=0, cnt =0;
    double avg;

    public void prSumAvg(){
        num = new int[]{num1, num2, num3, num4, num5};
        for(int i=0; i<num.length; i++){
            if(num[i]>=20&&num[i]<=50){
                sum+=num[i];
                cnt++;
            }
        }
        avg = sum/(double)cnt;
        System.out.println("합계 : "+sum);
        System.out.println("합계 : "+avg);

    }
}
