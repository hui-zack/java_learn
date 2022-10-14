package 第3阶段._3_Lambda表达式._2_练习Lambda表达式._1_Lambda无参无返回值;
//需求: 使用Lambda表达式通过接口操作方法实现接口
/*
注意:
    接口无参无返回值
    接口中只能一个抽象方法
*/
public class Eat_LambdaDemo {
    public static void main(String[] args) {
        //内部类和接口操作方法实现Eatable接口
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("喝啤酒, 吃炸鸡");
            }
        });

        //Lambda表达式实现操作方法接口
        useEatable( () -> {
            System.out.println("喝啤酒, 吃汉堡");
        });
    }


    private static void useEatable(Eatable e) {
        e.eat();
    }
}
