package 第1阶段._9_接口.类和接口的关系;

/*
类和接口的关系:
    类和类的关系:
    继承关系, 只能单继承, 但是可以多层继承
    类和接口的关系:
实现关系:
    单实现
    多实现
    可以继承一个类的同时是是实现多个接口
接口和接口的关系:
    继承关系:
    可单继承
    可多继承
*/

//一个类继承一个类的同时实现多个接口
public class InterImpl extends Object implements Inter1, Inter2, Inter3 {
}
