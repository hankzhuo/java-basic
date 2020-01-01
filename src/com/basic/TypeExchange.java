package com.basic;

public class TypeExchange {
    public static void main(String [] args) {
        // char 类型与 int 类型之间的转换，char 在 0 ~ 65535 范围
        char c = (char)6556; // 强制类型转换
        System.out.println("c="+c);
        int n;
        n = c; // 隐式类型转换

        // 整型和浮点型的类型转换问题
        int x = 1000;
        long y = x;
        x = (int)y; // 强制类型转换
        float f = 1000000000L;
        System.out.println("f="+f);
        float f1 = 103483948394L; // 精度丢失
        System.out.println("f1="+f1);
    }
}
