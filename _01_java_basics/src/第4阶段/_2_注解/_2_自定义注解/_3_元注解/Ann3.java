package 第4阶段._2_注解._2_自定义注解._3_元注解;


import java.lang.annotation.*;

@Target(ElementType.TYPE)               //指定注解的作用域
@Retention(RetentionPolicy.SOURCE)      //描述注解被保留到的阶段
@Documented                             //元注解注释的注解类, 可以抽取到API文档中
@Inherited                              //被该注解类修饰的类, 其子类将继承该注解
public @interface Ann3 {

    String method();

}
