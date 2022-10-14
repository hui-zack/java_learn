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
public interface Flyable {
    void fly(String s);
}
