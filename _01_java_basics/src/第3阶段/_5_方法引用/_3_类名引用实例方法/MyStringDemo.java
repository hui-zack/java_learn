package 第3阶段._5_方法引用._3_类名引用实例方法;
/*
定义一个接口(MyString), 里面定义一个抽象方法
    String mySubString(String s, int x, int y)
定义一个测试类(M有StringDemo), 在测试类中提供两个方法
    useMyString(MyString my)
    main
*/
public class MyStringDemo {
    public static void main(String[] args) {

        //Lambda实现MyString接口
        useMyString( (s, x, y) -> s.substring(x,  y));
        //类名引用成员方法, 实现MyString接口
        useMyString(String::substring);

        /*
        类名引用实例方法:
            第一个参数作为调用者
            后面的参数全部传递给该方法作为参数
        */

    }

    private static void useMyString(MyString s) {
        String result = s.mySubString("hello java", 6, 10);
        System.out.println(result);
    }
}















