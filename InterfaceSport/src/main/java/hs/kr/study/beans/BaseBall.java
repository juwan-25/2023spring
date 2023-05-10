package hs.kr.study.beans;

public class BaseBall implements Sports{
    String name;
    int player;

    @Override
    public void Sports(String name, int player) {
        this.name = name;
        this.player = player;
    }

    @Override
    public int getPlayer() {
        return player;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void rule() {
        System.out.println("야구 경기 규칙");
    }
}
