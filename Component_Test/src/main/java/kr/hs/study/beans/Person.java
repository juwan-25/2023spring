package kr.hs.study.beans;

import lombok.Data;

@Data
public class Person {
    String name;
    int age;
    String nickname;

    public Person(String name, int age, String nickname) {
        this.name = name;
        this.age = age;
        this.nickname = nickname;
    }

    public void go(){
        System.out.println("가다");
    }
}
