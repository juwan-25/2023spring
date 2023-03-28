package kr.hs.study.beans;

import lombok.Data;

@Data
public class TestBean1 {
    private DataBean1 data1;
    private DataBean2 data2;

    TestBean1(){
        System.out.println("testbean1 기본생성자");
    }
}
