package 第4阶段._2_注解._2_自定义注解._2_注解属性.注解属性的返回值.注解属性的返回值类型_只有五种;
// 注解属性的返回值类型

/*
注解属性返回值类型只能是如下五种:
    基本数据类型
    String
    枚举                  --> public enum Person{} 定义枚举类
    注解
    以上类型的数组
*/

import 第4阶段._2_注解._2_自定义注解._2_注解属性.注解属性的返回值.枚举类定义.Person;
import 第4阶段._2_注解._2_自定义注解._1_注解类.Ann;

public @interface Ann1 {
    int show1();            //基本数据类型
    String show2();         //String
    Person show3();         //枚举类
    Ann show4();            //注解
    String[] per();         //以上四种的数组
}
