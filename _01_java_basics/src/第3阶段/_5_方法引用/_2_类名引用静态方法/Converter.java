package 第3阶段._5_方法引用._2_类名引用静态方法;
/*
需求:
    定义一个接口(Converter), 里面定义一个抽象方法
        int convert(String s);
    定义一个测试类(ConverterDemo), 在测试类中提供两个方法
        useConverter(Converter c)方法
        main方法
*/
public interface Converter {
    int useConvert(String s);
}
