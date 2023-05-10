package kr.hs.study.Beans;

public class Jpop implements Music{
    Jpop(){
        System.out.println("jpop 생성자");
    }
    public void sound() {
        System.out.println("Jpop 음악 재생");
    }
}
