package 第1阶段._9_接口.接口成员特性;
//接口的实现类
public class InterImpl implements Inter{
    /*
        接口中没有构造方法, 本类中的构造方法不报错的原因在于,接口实现类实际上继承的是Object类
        接口实现类的类声明中, 隐形继承了Object类, 其实际代码如下:
            public class InterImpl extends Object implements FhilipROI.Inter {...}
     */

    //用来测试接口类中的构造方法
    public InterImpl() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("吃饭");
    }
}
