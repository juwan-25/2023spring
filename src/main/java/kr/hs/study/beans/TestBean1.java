package kr.hs.study.beans;

public class TestBean1 {
    private int data1;
    private double data2;
    private String data3;

    public TestBean1(){
        this.data1 = 0;
        this.data2 = 0.0;
        this.data3 = "spring0";
    }

    public void prData(){
        System.out.println("data1 : "+ data1);
        System.out.println("data2 : "+ data2);
        System.out.println("data3 : "+ data3);
    }
}
