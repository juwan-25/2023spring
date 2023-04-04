package kr.hs.study.beans;


public class TestBean3 {
    public TestBean3() {
        System.out.println("TestBean3의 기본생성자");
    }

    public void initMethod(){
        System.out.println("init method");
    }

    public void destroyMethod(){
        System.out.println("destroy method");
    }

}
