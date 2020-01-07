package com.method;

public class MethodDemo {
    public static void main(String[] args) {
        MethodDemo myMethodDemo = new MethodDemo();
        myMethodDemo.printStar();

        int area = myMethodDemo.getArea();
        System.out.println(area);

        myMethodDemo.printMax(1, 2);
        float m = 5.6f, n = 8.9f;
        myMethodDemo.printMax(m, n);

        myMethodDemo.fac(5);

        int a = 5, b = 10;
        int[] arr = {1,2,3,4};
        System.out.println(myMethodDemo.plus(a, b));
        System.out.println(myMethodDemo.plus(5.5, 6.4));
        System.out.println(myMethodDemo.plus(arr));
    }

    // 无参数无返回值方法
    public void printStar() {
        System.out.println("*********");
    }

    // 无参数带返回值方法
    public int getArea() {
        int length = 10;
        int width = 5;
        int area = length * width;
        return area;
    }

    // 带参无返回值方法
    public void printMax(float a, float b) {
        float max = 0;
        max = Math.max(a, b);
        System.out.println("max 最大值为："+ max);
    }

    // 带参有返回值方法
    public int fac(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    // 求两个 int 类型数的和
    public int plus(int m, int n) {
        return m + n;
    }

    // 求两个 double 类型数的和
    public double plus(double m, double n) {
        return m + n;
    }

    // 求数组元素的累加和
    public int plus(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
