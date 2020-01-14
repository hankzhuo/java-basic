package utils.wrapClass;

public class WrapTestTwo {
    public static void main(String[] args) {
        Integer one = new Integer(100);
        Integer two = new Integer(100);
        System.out.println("one === two 结果："+ (one == two));

        Integer three = 100; // 自动装箱
        // Integer three = Integer.valueOf(100)，当数值在 -128 ~ 127 范围，该值会在对象池会生成缓存
        System.out.println("three === 100 结果："+ (three == 100)); // 自动拆箱

        Integer four = 100; // 使用对象池中的缓存
        System.out.println("four === three 结果："+ (four == three));

        Integer five = 200;
        Integer six = 200;
        System.out.println("five === six 结果："+ (five == six));

        Double d1 = Double.valueOf(100); // double、float 类型没有对象池概念
        System.out.println("d1 === 100 结果："+ (d1 == 100));

        Double d2 = Double.valueOf(100);
        System.out.println("d1 === d2 结果："+ (d1 == d2));
    }
}
