package 第1阶段._4_方法;
//需求: 使用方法重载的思想; 设计比较两个整数是否相同的方法, 兼容全整数类型(byte,short,int,long)
public class methon_compare {
    public static void main(String[] args) {
      long num1 = (byte)2, num2 = (byte)3;
      boolean result = compare(num1, num2);
      System.out.println(result);

    }
    public static boolean compare(byte number1, byte number2)
    {
        System.out.println("byte");
        return number1 == number2;
    }
    public static boolean compare(short number1, short number2)
    {
        System.out.println("short");
        if(number1 == number2) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean compare(int number1, int number2)
    {
        System.out.println("int");
        if(number1 == number2) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean compare(long number1, long number2)
    {
        System.out.println("long");
        if(number1 == number2) {
            return true;
        } else {
            return false;
        }
    }


}
