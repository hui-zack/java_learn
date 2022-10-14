package _2_httpServlet._2_Response._3_case_checkCodeServlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/*
* 自动生成验证码, 使用response对象, 通过response-body返回至浏览器
* */
@WebServlet("/checkCode")
public class CheckCodeDemo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 实例化图片对象, 在内存中生成验证码图片
        int width = 100;
        int height = 50;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
                // BufferedImage(...) 图片生成对象, 第三个参数为设置图片格式(三原色-RGB图片)

        //2. 美化图片
            //2.1 填充背景色为粉色
        Graphics g = image.getGraphics();                           // 图片绘制对象 --> 背景默认黑色
        g.setColor(Color.PINK);                                     // 设置颜色属性 --> 粉色
        g.fillRect(0, 0, width, height);                       // 边框填充方法 --> 填充为矩形
            //2.2 绘制边框为蓝色
        g.setColor(Color.blue);                                     // 设置颜色属性 --> 蓝色
        g.drawRect(0, 0, width -1, height -1);    // 边框绘制方法
            //2.3 写验证码
        String str = "ABCDEFGHIJKLOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random ran = new Random();
        for (int i = 0; i < 4; i++) {
            int index = ran.nextInt(str.length());                  // 获取随机字符下标
            char ch = str.charAt(index);                            // 获取随机字符
            g.drawString(ch+"", width/5*(i+1), height/2);  // 图片上绘制字符
        }
            //2.4 画干扰线
        g.setColor(Color.green);
        for (int i = 0; i < 10; i++){
            int x1 = ran.nextInt(width);
            int x2 = ran.nextInt(width);
            int y1 = ran.nextInt(height);
            int y2 = ran.nextInt(height);

            g.drawLine(x1, y1, x2, y2);                             // 线段绘制方法
        }

        //3. 将图片输出到页面展示
        ImageIO.write(image,"jpg", resp.getOutputStream());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
