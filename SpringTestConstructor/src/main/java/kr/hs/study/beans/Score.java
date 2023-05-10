package kr.hs.study.beans;

public class Score {
    private int num1;
    private int num2;
    private int num3;
    private int num[];
    private int score[];

    Score(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    void compare(){
        score = new int[11];
        num = new int[]{num1, num2, num3};
        for(int i=0; i<num.length; i++){
            if(100==num[i]){
                score[10]++;
            } else if(num[i]>90) {
                score[9]++;
            }else if(num[i]>80) {
                score[8]++;
            }else if(num[i]>70) {
                score[7]++;
            }else if(num[i]>60) {
                score[6]++;
            }else if(num[i]>50) {
                score[5]++;
            }else if(num[i]>40) {
                score[4]++;
            }else if(num[i]>30) {
                score[3]++;
            }else if(num[i]>20) {
                score[2]++;
            }else if(num[i]>10) {
                score[1]++;
            } else {
                score[0]++;
            }
        }
    };

    public void prScore(){
        compare();
        for(int i=0; i<score.length; i++){
            System.out.println(i*10+"점대 학생 수 : "+score[i]);
        }
    }


}
