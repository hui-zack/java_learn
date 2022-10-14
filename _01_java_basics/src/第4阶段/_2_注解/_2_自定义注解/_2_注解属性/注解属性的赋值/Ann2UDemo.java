package 第4阶段._2_注解._2_自定义注解._2_注解属性.注解属性的赋值;

import 第4阶段._2_注解._2_自定义注解._2_注解属性.注解属性的返回值.枚举类定义.Person;
import 第4阶段._2_注解._2_自定义注解._1_注解类.Ann;

public class Ann2UDemo {
    //
    @Ann2(value = "java",number = 15, per = Person.p1, returnAnn = @Ann, array = {"jdk"})
    public void method(){
        System.out.println();
    }
}
