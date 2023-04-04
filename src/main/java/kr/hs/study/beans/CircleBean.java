package kr.hs.study.beans;

public class CircleBean {
    private int num;
    private int r;
    private int w;

    public void print(){
        if(num==0){
            System.out.println("프로그램 종료");
        } else if (num==1){
            System.out.println("넓이 : "+r*r*3.14+", 둘레 : "+2*3.14*r);
        } else if(num==2){
            System.out.println("넓이 : "+w*w);
        }
    }

    public CircleBean(int num, int r, int w) {
        this.num = num;
        this.r = r;
        this.w = w;
    }

    public CircleBean() {
    }

    public int getNum() {
        return num;
    }

    public int getR() {
        return r;
    }

    public int getW() {
        return w;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setW(int w) {
        this.w = w;
    }
}
