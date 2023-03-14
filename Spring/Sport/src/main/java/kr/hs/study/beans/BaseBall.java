package kr.hs.study.beans;

public class BaseBall implements Sports{
    @Override
    public void getPlayer() {
        System.out.print("5명");
    }

    @Override
    public void getName() {
        System.out.print("Baseball");
    }

    @Override
    public void rule() {
        System.out.print("------");
    }
}
