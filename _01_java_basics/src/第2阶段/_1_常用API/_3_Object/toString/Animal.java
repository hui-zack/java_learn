package 第2阶段._1_常用API._3_Object.toString;
// Animal的标准类, 添加了toString方法, 用来输出某对象的属性值, 参数为对象
public class  Animal {
    private String Name;
    private int age;

    public Animal() {
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
