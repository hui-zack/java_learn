package 第3阶段._3_Lambda表达式._2_练习Lambda表达式._2_Lambda带参无返回值;
//需求: 使用Lambda带参无返回的形式实现Flyable接口
/*
思路:
    定义一个接口(FlyDemo),
        只含有抽象方法: void fly(String s)
    定义一个测试类(Fly_LambdaDemo)
        含有useFlyable(Flyable f)方法
        含有main方法: 在main方法中调用useFlyable方法
*/

public class Fly_LambdaDemo {
    public static void main(String[] args) {
        //内部类+接口操作方法实现接口
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("说的不错");
            }
        });

        //Lambda+接口操作方法实现接口
        useFlyable( (String s) -> {
            System.out.println("碧水蓝天, 微风絮絮");
            System.out.println("说的真好");
        });
    }

    private static void useFlyable(Flyable f) {
        f.fly("风和日丽, 晴空万里");
    }
}
