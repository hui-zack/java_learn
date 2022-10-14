package 第3阶段._8_反射._0_获取Class对象;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //Object的class变量, 返回.class对象
        Class<Student> c1 = Student.class;
        System.out.println(c1);

        //Object的getClass方法, 返回.class对象
        Student s = new Student();
        Class<? extends Student> c2 = s.getClass();
        System.out.println(c2);

        //Class.forName(String className)方法, 返回Class对象
        Class<?> c3 = Class.forName("第3阶段._8_反射._0_获取Class对象.Student");
        System.out.println(c3);
    }
}
