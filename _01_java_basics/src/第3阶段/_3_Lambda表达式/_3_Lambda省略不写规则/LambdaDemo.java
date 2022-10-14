package 第3阶段._3_Lambda表达式._3_Lambda省略不写规则;

public class LambdaDemo {
    public static void main(String[] args) {
        // 参数的类型可省略不写: 若含有多个参数, 参数的类型要么全省略, 要么全不省略
        useAddable( (x, y) -> {
            return x + y;
        });

        //如果参数有且只有一个, 可省略不写小括号:
        useFlyable( s -> {
            System.out.println(s);
        });

        //如果代码块的语句只有一条, 可省略不写大括号和里面的分号
        useAddable( (x, y) -> x+y);

        System.out.println("--------");

        //综合使用
        useFlyable( x -> System.out.println(x));

        useAddable( ((x, y) -> x + y));

    }
    public static void useAddable(Addable a){
        int sum = a.add(10, 20);
        System.out.println(sum);
    }

    public static void useFlyable(Flyable f){
        f.fly("风和日丽, 晴空万里");
    }
}
