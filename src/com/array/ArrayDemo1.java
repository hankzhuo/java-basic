package com.array;

import sun.jvm.hotspot.debugger.cdbg.Sym;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] arr = {23,45,22,11};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值为："+max);

        // foreach 循环
        int[] arr1 = {1,2,3,4};
        for (int n:arr1) {
            System.out.print(n + " ");
        }
    }
}
