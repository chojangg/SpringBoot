package kr.hs.study.beans;

public class TestBean1 {
    public TestBean1(){
        System.out.println("TestBean의 기본생성자");
    }
    public void init_method() {
        System.out.println("TestBean의 init method");
    }
    public void destory_method() {
        System.out.println("TestBean의 destroy method");
    }

}
