public class MainClass {
    public static void main(String[] args) {
        // helloworlden 객체 만들고
        HelloWorldEn hello1 = new HelloWorldEn();
        //callMethod(객체);
        callMethod(hello1);

        HelloWorldKr hello2 = new HelloWorldKr();
        callMethod2(hello2);



    }
    static void callMethod(HelloWorldEn hello){
        hello.sayHello();
    }
    static void callMethod2(HelloWorldKr hello){
        hello.sayHello();
    }

}
