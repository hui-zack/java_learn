package 第3阶段._5_方法引用._2_类名引用静态方法;
/*
需求:
    定义一个接口(Converter), 里面定义一个抽象方法
        int convert(String s);
    定义一个测试类(ConverterDemo), 在测试类中提供两个方法
        useConverter(Converter c)方法
        main方法
*/
public class ConverterDemo {
    public static void main(String[] args) {
        //内部类实现接口
        useConverter(new Converter() {
            @Override
            public int useConvert(String s) {
                return Integer.parseInt(s);
            }
        });

        //Lambda实现接口
        useConverter( (s) ->  Integer.parseInt(s));

        //引用类方法实现接口
        useConverter(Integer::parseInt);

    }

    private static void useConverter(Converter c){
        int number = c.useConvert("9277");
        System.out.println(number);
    }

}
