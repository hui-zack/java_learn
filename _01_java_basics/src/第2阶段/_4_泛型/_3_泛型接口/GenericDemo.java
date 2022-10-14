package 第2阶段._4_泛型._3_泛型接口;

//需求: 创建泛型接口和其实现类, Demo中调用
public class GenericDemo {
    public static void main(String[] args) {
        GenericImpl<String> gl = new GenericImpl<>();
        gl.show("林青霞");
    }
}





















