package utils.excecption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CatchErrorDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("请输入第一个数字：");
            int one = input.nextInt();
            System.out.println("请输入第一个数字：");
            int two = input.nextInt();
            System.out.println("one/two 求整等于" + (one / two));
        } catch (ArithmeticException e) {
            System.out.println("程序出错啦~");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("请输入整数~");
            e.printStackTrace();
        } catch (Exception e) { // 无法分别错误类型
            System.out.println("出错啦~");
            e.printStackTrace();
        } finally {
            System.out.println("=====运行结束======");
        }
    }

    // 通过 throws 抛出异常，针对可能出现的多种异常情况
    public static int test() throws ArithmeticException, InputMismatchException {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int one = input.nextInt();
        System.out.println("请输入第一个数字：");
        int two = input.nextInt();
        System.out.println("one/two 求整等于" + (one / two));
        return one / two;
    }
}
