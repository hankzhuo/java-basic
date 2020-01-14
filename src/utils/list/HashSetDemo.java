package utils.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set set = new HashSet<>();
        set.add("blue");
        set.add("green");
        set.add("black");

        // 迭代器
        Iterator it = set.iterator();
        // 遍历迭代器并输出元素
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // 插入重复元素
        set.add("blue");
        it = set.iterator();
        System.out.println();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
