package 第1阶段._6_学生管理系统;

import java.util.ArrayList;
import java.util.Scanner;


public class Demo {
    // 主界面:
    public static void main(String[] args) {
        /*
        思路:
        (1)用输出语句完成主界面的编写
        (2)用Scanner实现键盘录入数据
        (3)用Switch语句完成操作的选择

        */

        //对象声明
        ArrayList<Student> array_student = new ArrayList<>();   //集合

        while (true) {

            // (1)打印主界面
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.print("请输入你的选择:");

            //(2)Scanner录入操作选择
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            //(3)switch完成操作的选择
            switch (line) {
                case "1":
                    //System.out.println("添加学生");
                    addStudent(array_student);
                    break;
                case "2":
                    //System.out.println("删除学生");
                    removeOneStudent(array_student);
                    break;
                case "3":
                    //System.out.println("修改学生");
                    changeOneStudent(array_student);
                    break;
                case "4":
                    //System.out.println("查看学生");
                    checkAllStudent(array_student);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);         //这里使用break只能跳出switch, 无法终止while,故使用return
                    //也可以使用 System.exit(0) 通过关闭虚拟机完成操作
            }
        }
    }

    // 添加学生方法, 返回值:void 传参:ArrayList<Student>
    public static void addStudent(ArrayList<Student> array) {
        /*
        1) 显示提示信息, 提示要输入何种信息
        2) 键盘录入学生对象所需要的数据
        3) 创建学生对象, 把键盘录入的数据赋值
        4) 将学生对象添加到集合中
        5) 给出添加成功的提示
        */

        Scanner sc = new Scanner(System.in);        //键盘录入
        Student classmate = new Student();          //学生对象

        // 1) 显示提示信息, 提示要输入何种信息 2) 键盘录入学生对象所需要的数据
        System.out.print("请输入学生学号:");
        String sid = sc.nextLine();
        System.out.print("请输入学生姓名:");
        String name = sc.nextLine();
        System.out.print("请输入学生年龄:");
        String age = sc.nextLine();
        System.out.print("请输入学生地址:");
        String address = sc.nextLine();

        //学生对象对象赋值操作
        classmate.setSid(sid);
        classmate.setName(name);
        classmate.setAge(age);
        classmate.setAddress(address);

        //学生对象信息添加到集合
        array.add(classmate);
        System.out.println("--- 添加成功 ---");

    }

    // 查看学生信息, 返回值:void 传参:ArrayList<Student>
    public static void checkAllStudent(ArrayList<Student> array) {
        /*
        思路:
            1) 显示表头信息
            2) 将集合中数据遍历打印, 年龄补充多少岁
        */
        //集合中数据的判断:
        if (array.size() == 0) {
            System.out.println("--没有学生信息--");
        } else {
            // 表头信息
            System.out.println("学号\t\t\t姓名\t\t年龄\t\t地址");

            // 学生信息打印
            for (Student s : array) {
                System.out.println(s.getSid() + "\t" + s.getName() + "\t\t" + s.getAge() + "岁\t\t" + s.getAddress());
            }
        }
    }

    // 删除学生信息, 返回值:void 传参:ArrayList<Student>
    public static void removeOneStudent(ArrayList<Student> array) {

/*  思路:
        定义一个方法, 用于删除指定的学生信息
            1)用显示提示信息
            2)键盘录入要删除的学生学号
            3)遍历集合将对应学生对象从集合中删除
            4)给出删除成功提示
*/
        //显示提示, 录入待删学生学号
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要删除学生的学号:");
        String sid_input = sc.nextLine();

        //删除操作
        int status = -1;
        for (int i=0; i<array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid_input)) {         //s和sid_input都是字符串, 可以用equals比较
                array.remove(i);
                status = 0;
                break;
            }
        }
        if (status == -1) {
            System.out.println("--输入的学号有错误--");
        } else if (status == 0) {
            System.out.println("--删除成功--");
        }

    }

    // 修改学生信息, 返回值:void 传参:ArrayList<Student>
    public static void changeOneStudent(ArrayList<Student> array) {
        /*
        1)显示提示信息
        2)键盘录入要修改的学生学号
        3)键盘录入要修改的学生信息
        4)遍历集合修改对应的学生信息
        5)给出修改成功提示
        */

        // 调用键盘录入
        Scanner sc = new Scanner(System.in);

        // 键盘录入修改信息, 并用变量接收
        System.out.print("请输入要修改的学生学号:");
        String sid_input = sc.nextLine();

        //sid是否存在作为分支条件
        int status = -1;
        for (Student s : array) {
            if (s.getSid().equals(sid_input)) {
                status = 0;
            }
        }
        if (status == 0) {
            System.out.print("请输入新学号:");
            String sid_new = sc.nextLine();
            System.out.print("请输入新的姓名:");
            String name_new = sc.nextLine();
            System.out.print("请输入新的年龄:");
            String age_new = sc.nextLine();
            System.out.print("请输入新的地址:");
            String address_new = sc.nextLine();

            //遍历参数链表, 查找待修改学生位置, 进行修改
            for (Student s : array) {
                if (s.getSid().equals(sid_input)) {
                    s.setSid(sid_new);
                    s.setName(name_new);
                    s.setAge(age_new);
                    s.setAddress(address_new);

                    status = 0;
                    break;
                }
            }
            System.out.println("--修改成功");
        } else {
            System.out.println("--输入的学号有错误--");
        }
    }

}