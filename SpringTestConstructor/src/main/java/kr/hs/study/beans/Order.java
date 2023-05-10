package kr.hs.study.beans;

public class Order {
    private String str1;
    private String str2;
    Order(String str1, String str2){
        this.str1 = str1;
        this.str2 = str2;
    }
    public void prData(){
        System.out.println("순서 바꿔서 출력 > "+str1+", "+str2);
    }

}
