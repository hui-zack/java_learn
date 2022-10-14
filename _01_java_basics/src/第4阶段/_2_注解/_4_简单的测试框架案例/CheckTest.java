package 第4阶段._2_注解._4_简单的测试框架案例;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

public class CheckTest {
    public static void main(String[] args) throws IOException {
        Calculator cal = new Calculator();
        Class<? extends Calculator> cls = cal.getClass();

        int number;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txr"));
        Method[] methods = cls.getMethods();
        for (Method me : methods) {
            if (me.isAnnotationPresent(Check.class)) {
                try {
                    me.invoke(cal);
                } catch (Exception e) {
                    bw.write("异常位置: " + me.getName());
                    bw.newLine();
                    bw.write("异常的名称: " + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因: " + e.getCause().getMessage());
                    bw.newLine();
                    bw.flush();
                }
            }
        }
        bw.write("----------------------------");
        bw.close();
    }
}
