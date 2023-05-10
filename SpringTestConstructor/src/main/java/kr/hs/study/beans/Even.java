package kr.hs.study.beans;

public class Even {
    private int num1;
    private int num2;
    private int num3;
    private int num[];

    Even(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;

    }

    public void prEven(){
        num = new int[]{num1, num2, num3};
        for(int i=0; i<num.length; i++){
            if(num[i]%2==0) System.out.print(num[i]+" ");
        }
    }
}
