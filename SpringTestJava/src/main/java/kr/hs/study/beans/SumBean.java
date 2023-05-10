package kr.hs.study.beans;

public class SumBean {
    private int n;
    private int m;

    public void sumTo(){
        int tot=0;
        for(int i=n; i<=m; i++){
            tot+=i;
        }
        System.out.println(tot);
    }

    public SumBean() {
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setM(int m) {
        this.m = m;
    }

    public SumBean(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }
}
