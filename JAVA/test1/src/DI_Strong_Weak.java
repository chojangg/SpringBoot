import java.util.Date;

public class DI_Strong_Weak {
    public static void main(String[] args){
        Date d = new Date();    // 강한결합
        System.out.println("date: " + d);
    }
    public static void getDate(Date d){     // 약한결합
        Date date = d;
        System.out.println("date2: " + d);
    }

    public static void memberUse1(){
//        Member m1 = new Member();   // 강한결합
    }

    public static void memberUse2(Member m){
        Member m2 = m;      // 약한결합
    }
}

class Member{
    String name;
    String nickname;
    private Member(){}
}
