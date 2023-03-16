package kr.hs.study.beans;

public class TestBean1 {
    private int data1;
    private double data2;
    private String data3;

    public TestBean1() {
        System.out.println("TestBean1의 기본생성자");
        this.data1=0;
        this.data2=0.0;
        this.data3="spring0";
    }
    public TestBean1(int data1){
        System.out.println("TestBean1의 int data1");
        this.data1=data1;
        this.data2=1.1;
        this.data3="spring1";
    }

    public TestBean1(double data2) {
        System.out.println("TestBean1의 double data2");
        this.data1=2;
        this.data2=data2;
        this.data3="spring2";
    }
    // 14번 라인으이 생성자를 호출하는 객체를 생성
//    TestBean1 testBean1 = new TestBean1(10);

    public TestBean1(String data3) {
        System.out.println("TestBean1의 double data3");
        this.data1=3;
        this.data2=3.3;
        this.data3=data3;
    }
    public void prData() {
        System.out.println("data1: "+data1);
        System.out.println("data2: "+data2);
        System.out.println("data3: "+data3);
        System.out.println("=======================");
    }
}
