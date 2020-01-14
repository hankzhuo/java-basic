package utils.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        System.out.println("列表中元素个数为："+ list.size());

        // 遍历所有元素
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // 移除元素
        list.remove(1);
        System.out.println("列表中元素个数为："+ list.size());
    }
}
