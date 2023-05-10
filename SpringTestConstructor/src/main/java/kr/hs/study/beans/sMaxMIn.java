package kr.hs.study.beans;

public class sMaxMIn {
    private int num1;
    private int num2;
    private int num3;
    private int num[];

    sMaxMIn(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

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
