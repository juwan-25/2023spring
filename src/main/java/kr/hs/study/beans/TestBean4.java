package kr.hs.study.beans;

public class TestBean4 {
    TestBean4(){
        System.out.println("testbean4의 기본생성자");
    }

    public void init(){
        System.out.println("init 메서드");
    }

    public void destroy(){
        System.out.println("destroy 메서드");
    }
}
