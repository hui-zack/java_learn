package 第3阶段._5_方法引用._1_体验方法引用_方法引用符;
//需求:
//  1. 定义一个接口(Printable), 里面定义一个抽象方法: void printString(String s)
//  2. 定义一个测试类(printableDemo), 在测试类中提供两个方法
//      一个方法是: usePrintable(Printable p)
//      一个方法为main方法, 在主方法中调用uesPrintable方法
public class PrintableDemo {
    public static void main(String[] args) {
        //Lambda实现接口
        usePrintable(s -> System.out.println(s));
        //方法引用实现接口 在接口的方法中引用了System.out.println的代码
        usePrintable(System.out::println);

    }

    private static void usePrintable(Printable p){
        p.printString("热爱生活, 热爱java");
    }
}
