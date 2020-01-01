package com.basic;

public class MathDemo {
    public static void main(String[] args) {
        int num1 = 10, num2 = 5;
        int result;

        //加法
        result = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + result);
        // 字符串连接
        System.out.println("" + num1 + num2); // 105
        // 减法
        result = num1 - num2;
        System.out.println(num1 + "-" + num2 + "=" + result);
        // 乘法
        result = num1 * num2;
        System.out.println(num1 + "*" + num2 + "=" + result);
        // 除法
        result = num1 / num2;
        System.out.println(num1 + "/" + num2 + "=" + result);
        // 分子分母都是整型时，结果为整除后的结果，舍去小数后面
        System.out.println("13/5="+13/5); // 2
        System.out.println("13.0/5="+13.0/5); // 2.6
        // 求余数
        result = 13 % num2;
        System.out.println("13%" + num2 + "=" + result);
        System.out.println("13.5%" + num2 + "=" + (13.5%5));
    }
}
