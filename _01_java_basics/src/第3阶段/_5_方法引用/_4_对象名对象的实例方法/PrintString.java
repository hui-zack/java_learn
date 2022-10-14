package 第3阶段._5_方法引用._4_对象名对象的实例方法;
/*
需求:
    定义一个接口(Printer), 里面定义一个抽象方法
        void printUpperCase(String s);
    定义一个类(PrintString), 里面定义一个方法
        public void printUpper(String s); 把字符串参数转换为大写的数据, 然后在控制台输出
    定义一个测试类(PrinterDemo), 在测试类中提供两个方法
        void usePrinter(printer p)
        main
*/
public class PrintString {
    public void printUpper(String s){
        String us = s.toUpperCase();
        System.out.println(us);
    }
}
