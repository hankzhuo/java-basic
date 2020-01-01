package com.basic;

public class CharDemo {
    public static void main(String [] args) {
        // 定义一个字符
        char a='a';
        System.out.println("a="+a);
        // 65 会转换成 ASCII 码
        char ch=65;
        System.out.println("ch="+ch); // A
        // 如果字面值超出 char 类型所表示的数据范围，需要进行强制类型转换
        char ch1=(char)65535;
        System.out.println("ch="+ch1);
        // 定义变量 unicode 编码表示字符
        char c='\u005d';
        System.out.println("unicode="+c);
    }
}
