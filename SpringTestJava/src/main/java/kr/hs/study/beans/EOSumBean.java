package kr.hs.study.beans;

public class EOSumBean {
    private int n;
    private char ch;

    public void eoPrint(){
        if(ch=='o') {
            for(int i=1; i<=n; i++){
                if(i%2==1) System.out.print(i+" ");
            }
        } else if(ch=='e'){
            for(int i=1; i<=n; i++){
                if(i%2==0) System.out.print(i+" ");
            }
        }
    }

    public EOSumBean(int n, char ch) {
        this.n = n;
        this.ch = ch;
    }

    public EOSumBean() {
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public int getN() {
        return n;
    }

    public char getCh() {
        return ch;
    }
}
