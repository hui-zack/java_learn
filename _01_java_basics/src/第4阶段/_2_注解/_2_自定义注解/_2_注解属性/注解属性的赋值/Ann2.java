package 第4阶段._2_注解._2_自定义注解._2_注解属性.注解属性的赋值;

import 第4阶段._2_注解._2_自定义注解._2_注解属性.注解属性的返回值.枚举类定义.Person;
import 第4阶段._2_注解._2_自定义注解._1_注解类.Ann;

public @interface Ann2 {
    String value();
    int number() default 12;
    Person per() default Person.p1;
    Ann returnAnn() default @Ann();
    String[] array() default {"jdk-15.02", "jvm"};
}
