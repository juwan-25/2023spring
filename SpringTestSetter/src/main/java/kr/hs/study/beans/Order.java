package kr.hs.study.beans;

import lombok.Data;

@Data
public class Order {
    private String str1;
    private String str2;

    public void prData(){
        System.out.println("순서 바꿔서 출력 > "+str1+", "+str2);
    }

}
