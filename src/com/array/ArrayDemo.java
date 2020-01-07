package com.array;

public class ArrayDemo {

    public static void main(String[] args) {
        // 声明一个整型数组
        int[] intArray;
        // 声明一个字符串类型的数组
        String strArray[];
        // 创建数组
        intArray = new int[5];
        strArray = new String[10];
        // 声明数组的同时进行创建
        float[] floatArray = new float[4];
        // 初始化数组
        char[] ch = {'a', 'b', 'c'};

        System.out.println("ch数组的长度为："+ch.length);
        System.out.println("intArray 数组的第一项："+intArray[1]);
        System.out.println("strArray数组的第四项："+strArray[4]);
        System.out.println("floatArray数组最后一项："+floatArray[floatArray.length - 1]);

        // 循环为整型数组赋值
        for(int i = 0; i < 5; i++) {
            intArray[i] = 1;
        }

        System.out.println("intArray 数组的第一项："+intArray[1]);
    }
}
