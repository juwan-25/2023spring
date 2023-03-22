package kr.hs.study.beans;

public class Compare {
    private int num1;
    private int num2;

    Compare(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void prCom(){
        if(num1>num2) System.out.println(1);
        else if(num1<num2) System.out.println(0);
        else System.out.println(num1+"=="+num2);
    }
}
