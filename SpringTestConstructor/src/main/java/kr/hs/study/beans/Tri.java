package kr.hs.study.beans;

public class Tri {
    private int num1;
    private int num2;
    private int num3;
    private int num[];

    Tri(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    int max(){
        num = new int[]{num1, num2, num3};
        int max = num[0];
        for(int i=1; i<num.length; i++){
            if(max<num[i]) max=num[i];
        }
        return max;
    }

    public void prTri(){
        if(max()<(num1+num2+num3)-max()) System.out.println("삼각형 가능");
        else System.out.println("심긱향 불가능");
    }

}
