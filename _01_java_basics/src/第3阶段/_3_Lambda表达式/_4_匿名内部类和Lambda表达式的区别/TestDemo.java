package 第3阶段._3_Lambda表达式._4_匿名内部类和Lambda表达式的区别;

public class TestDemo {
    public static void main(String[] args) {
        //匿名内部类调用接口
        useInter(new Inter() {
            @Override
            public void show(String s) {
                System.out.println(s);
            }
        });
        //匿名内部类调用抽象类
        useAnimal(new Animal() {
            @Override
            public void eat(String s) {
                System.out.println(s + "啃桌子");
            }
        });
        //匿名内部类调用具体类
        useStudent(new Student(){
            @Override
            public void method(String s) {
                System.out.println(s + "要成为全栈工程师");
            }
        });


        //Lambda实现函数式接口
        useInter( s -> System.out.println(s));
    }





    private static void useInter(Inter i) {
        i.show("风和日丽, 晴空万里");
    }

    private static void useAnimal(Animal a){
        a.eat("哈士奇");
    }

    private static void useStudent(Student s) {
        s.method("张辉");
    }
}
