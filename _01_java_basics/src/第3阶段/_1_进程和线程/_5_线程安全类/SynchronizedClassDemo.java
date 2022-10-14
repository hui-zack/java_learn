package 第3阶段._1_进程和线程._5_线程安全类;

import java.util.*;

public class SynchronizedClassDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //下面是获取StringBuilder线程安全类的方式
        StringBuffer sb2 = new StringBuffer();

        ArrayList<String> array = new ArrayList<>();
        //下面是是获取线程线程安全类的方式
        List<String> array1 = Collections.synchronizedList(new ArrayList<>());
        Vector<String> vector = new Vector<>();


        HashMap<String, String> hm = new HashMap<>();
        //下面是获取线程安全类的方式
        Map<String, String> hm2 = Collections.synchronizedMap(new HashMap<String, String>());
        Hashtable<String, String> hmt= new Hashtable<>();


    }

}
