package 第4阶段._2_注解._3_注解解析._1_注解存放属性值并解析;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
* 注释类
* 存放配置信息:
*   className 该类的包地址
*   method    该类的方法名
*
* */
@Target({ElementType.TYPE, ElementType.METHOD})                   //注解修饰位置: 类声明上方
@Retention(RetentionPolicy.RUNTIME)                               //注解内容保留到: 编译后
public @interface ConfigFile {
    String className();
    String method();
}
