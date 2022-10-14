package 第4阶段._1_Junit单元测试.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import 第4阶段._1_Junit单元测试.junit.Calculator;


public class CalculatorTest {
    Calculator cal;
    @Before
    public void init() {
        this.cal = new Calculator();
        System.out.println("start...");
    }

    @After
    public void close(){
        System.out.println("close..." + "\n");
    }

    @Test
    public void testAdd() {
        int result = cal.add(1, 2);

        Assert.assertEquals(3, result);         //结果的断言
    }

    @Test
    public void testSub() {
        int result = cal.sub(10, 6);              //结果的断言
        Assert.assertEquals(4, result);
    }
}
