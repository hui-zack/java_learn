package 第3阶段._3_Lambda表达式._2_练习Lambda表达式._3_Lambda带参带返回值;

//需求: 使用Lambda带参含返回值的形式, 实现Addable接口
/*
思路:
    定义一个接口(Addable),
        只定义一个抽象方法, int add(int x, int y)
    定义一个测试类(Add_LambdaDemo), 含有两个方法
        一个方法是: useAddable(Addable a)
        一个方法是main方法: 在main方法中调用useAddable方法
*/
public class Add_LambdaDemo {
    public static void main(String[] args) {

        useAddable((int x, int y) -> {
            return x + y;
        });

    }

    public static void useAddable(Addable a){
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
