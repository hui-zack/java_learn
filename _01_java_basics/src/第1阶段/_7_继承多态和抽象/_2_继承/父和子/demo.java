// 需求: 通过实例化子类对象, 调用父类中的show方法
package 第1阶段._7_继承多态和抽象._2_继承.父和子;

public class demo {
    public static void main(String[] args) {
        //通过实例化子类对象, 调用父类中的show方法
        zi son = new zi();
        son.show();

        //super调用父类age
        son.show();

    }
}
