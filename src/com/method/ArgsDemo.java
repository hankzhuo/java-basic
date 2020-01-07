package com.method;
/**
 * 关于可变参数列表和重载的问题
 * @author hank
 * @version 1.0
 */

public class ArgsDemo {
    public static void main(String[] args) {
        ArgsDemo argsDemo = new ArgsDemo();

        // 如果存在重载，可变参数列表所在的方法是最后被访问的
        argsDemo.plus(2, 3);
    }

    public int plus(int a, int b) {
        int sum = a + b;
        System.out.println("不带可变参数 sum="+sum);
        return sum;
    }

    // 可变参数
    public int plus(int... n) {
        int sum = 0;
        for (int i: n) {
            sum += i;
        }
        System.out.println("带有可变参数 sum="+sum);
        return sum;
    }
}
