package 第3阶段._8_反射._1_类加载器.获取src下任意文件绝对路径;
//需求: 使用类加载器获取src下任意文件的绝对路径
public class Demo {
    public static void main(String[] args) {
        String path = Demo.class.getClassLoader().getResource("config/set.properties").getPath();
        System.out.println(path);
    }
}
