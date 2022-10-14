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


public class PrinterDemo {
    public static void main(String[] args) {
        //使用Lambda直接重写接口, 输出大写字符串
        usePrinter( s -> System.out.println(s.toUpperCase()));

        //引用PrintString的代码, 实现接口
        PrintString ps = new PrintString();
        usePrinter(ps::printUpper);
    }

    private static void usePrinter(Printer p) {
        p.printUpperCase("java world");
    }
}
