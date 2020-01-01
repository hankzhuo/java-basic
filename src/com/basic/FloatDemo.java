package com.basic;

public class FloatDemo {
    public static void main(String[] args) {
        // 定义一个单精度浮点型变量
        float f = 123.24f;
        System.out.println("f="+ f);
        // 定义一个双精度浮点型变量
        double d = 4345.234;
        System.out.println("d="+ d);
        // 将整型赋值给浮点型
        double d1 = 124;
        System.out.println("d1="+d1); // 124.0
        // 变量间赋值
        double d2 = d;
        System.out.println("d2="+d2);
    }
}
