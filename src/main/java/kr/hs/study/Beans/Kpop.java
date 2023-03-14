package kr.hs.study.Beans;

public class Kpop implements Music{
    Kpop(){
        System.out.println("kpop 생성자");
    }
    public void sound() {
        System.out.println("Kpop 음악 재생");
    }
}
