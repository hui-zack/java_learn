package 第2阶段._4_泛型._1_泛型类;
//需求: 定义一个泛型类, 并在Demo中使用
public class Generic<T> {
    private T t;

    public T getT() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }
}
