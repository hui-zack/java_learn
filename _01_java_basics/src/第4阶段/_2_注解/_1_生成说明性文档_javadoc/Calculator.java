package 第4阶段._2_注解._1_生成说明性文档_javadoc;

/**
 * 注解javadoc演示
 *
 * @author Hui
 * @version 1.0
 * @since 1.5
 * */
public class Calculator {

    /**
     *
     * @param a 整数a
     * @param b 整数b
     * @return a和b的和
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     *
     * @param a 整数a
     * @param b 整数b
     * @return  a和b的差
     */
    public int sub(int a, int b) {
        return a - b;
    }
}
