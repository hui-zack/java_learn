import java.io.*;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.UUID;

public class tongsheng_tcp {
    public static void main(String[] args) throws IOException {
        tcp_client();
    }

    public static void tcp_client() throws IOException {
        Socket s = new Socket("192.168.1.238", 9776);

        //从文件读取数据并发送至客户端
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data\\test_image_1.jpg"));           // 读取图片
        // BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());                                         // 接受对象
        DataOutputStream bos = new DataOutputStream(new FileOutputStream("C:\\Users\\admin\\Desktop\\space\\me\\data.bin"));
        String uuid_str = UUID.randomUUID().toString();                                             // 获取uuid       36字节
//        String data_type = String.format("%04d", 1);
//        String encode_type = String.format("%04d", 0);
//        String now_data_section = String.format("%04d", 1);
//        String all_data_section = String.format("%04d", 1);
//        int img_size_of_int = (int) new File("data\\test_image_1.jpg").length();
//        String img_size = String.format("%04d", img_size_of_int);                                   // 获取img长度     4字节
//        String data_size = img_size;
//        String img_type = String.format("%04d", 1);
//        String img_width = String.format("%04d", 1920);                                              // 获取图片宽度     4字节
//        String img_high = String.format("%04d", 1080);                                              // 获取图片高度     4字节
//        String version = String.format("%04d", 101);                                                // 获取版本号       4字节
        // 数据组装发送
//        bos.write("xtmagic".getBytes());
//        bos.write(version.getBytes());
//        bos.write(uuid_str.getBytes());
//
//        System.out.println("xtmagic".getBytes().length);
//        bos.write(uuid_str.getBytes());
//        bos.write(data_type.getBytes());
//        bos.write(encode_type.getBytes());
//        bos.write(now_data_section.getBytes());
//        bos.write(all_data_section.getBytes());
//        bos.write(img_size.getBytes());
//        bos.write(data_size.getBytes());
//        bos.write(img_type.getBytes());
//        bos.write(img_width.getBytes());
//        bos.write(img_high.getBytes());
//        byte[] bys = new byte[1024];
//        int len;
//        while ((len = bis.read(bys)) != -1) {
//            bos.write(bys, 0, len);
//            bos.flush();
//        }
//        bos.write("xtmagicend".getBytes());
        int data_type = 1;
        int encode_type = 0;
        int now_data_section = 1;
        int all_data_section = 1;
        int img_size = (int) new File("data\\test_image_1.jpg").length();
        int data_size = img_size;
        int img_type = 1;
        int img_width = 1920;
        int img_high = 1080;
        int version = 101;
//        ByteBuffer pump_on_buf = new ByteBuffer().compact();
//
//        pump_on_buf.putInt(0);
//        pump_on_buf.putInt(0);
//        pump_on_buf.putShort(21);
//        pump_on_buf.putShort(96);
//        pump_on_buf.putInt(512);
//        byte[] pump_on = pump_on_buf.array();

        // 数据组装发送
        bos.write("xtmagic".getBytes());
        bos.write((byte)version);
        bos.write(uuid_str.getBytes());

        System.out.println("xtmagic".getBytes().length);
        bos.write(uuid_str.getBytes());
        bos.write((byte) data_type);
        bos.write(encode_type);
        bos.write(now_data_section);
        bos.write(all_data_section);
        bos.write(img_size);
        bos.write(data_size);
        bos.write(img_type);
        bos.write(img_width);
        bos.write(img_high);
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
            bos.flush();
        }
        bos.write("xtmagicend".getBytes());
/*
        //数据发送输出流结束提示符
        s.shutdownOutput();

        //接受Server反馈
        BufferedInputStream bisClient = new BufferedInputStream(s.getInputStream());
        System.out.println(new String(bys, 0, bisClient.read(bys)));
        //接受反馈结束标记
        s.shutdownInput();

        //释放资源
        s.close();
        bis.close();
        bisClient.close();*/
    }
}
