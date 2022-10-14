package 第1阶段._9_接口.运动员和教练案例;
//需求: 我们现在有乒乓球运动员和篮球运动员, 乒乓球教练和蓝球教练. 为了出国交流, 艮乒乓球相关的的人员都需要学习英语
//  请问这个案例中有哪些具体类, 哪些抽象类, 哪些接口, 并用代码实现
/*
(0)定义说英语接口:
    成员方法:说英语()
(1)定义抽象人类:
    成员变量:姓名, 年龄
    构造方法:无参带参
    成员方法:get/set, 吃饭
(2)定义抽象教练类, 继承人类:
    构造方法:无参, 带参
    成员方法:教()
(3)定义抽象运动员类, 继承人类:
    构造方法:无参, 带参
    成员方法:学习()
(4)定义具体篮球教练类, 继承教练类:
    构造方法:无参, 带参
    成员方法:重写吃饭(), 重写教()
(5)定义具体篮球运动员类, 继承运动员类:
    构造方法:无参带参
    成员方法:重写吃饭(), 重写教(), 重写说英语()
(6)定义具体乒乓球教练类, 继承教练类, 实现说英语接口
    构造方法:无参带参
    成员方法:重写吃饭(), 重写教(), 重写说英语()
(7)定义具体乒乓球运动员类, 继承运动员类, 实现说英语接口
    构造方法:无参带参
    成员方法:重写吃饭(), 重写学习(), 重写说英语()

*/
public class PingpangCoach extends Coach implements SpeakEnglish{
    public PingpangCoach() {
    }

    public PingpangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃雪糕, 喝可乐");
    }

    @Override
    public void teach() {
        System.out.println("教乒乓球运动员打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练说英语");
    }
}
