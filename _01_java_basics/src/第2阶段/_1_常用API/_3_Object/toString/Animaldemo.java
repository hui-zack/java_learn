package 第2阶段._1_常用API._3_Object.toString;

// 需求: 验证重写的Object方法--> toString
public class Animaldemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.setName("月牙");
        a.setAge(2);
        System.out.println(a.toString());
    }

}



