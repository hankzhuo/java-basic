package utils.wrapClass;

public class WrapTestOne {
    public static void main(String[] args) {
        // 自动装箱
        int t1 = 2;
        Integer t2 = t1;
        // 手动装箱
        Integer t3 = new Integer(t1);

        System.out.println("Integer 类型对象 t2="+ t2);
        System.out.println("Integer 类型对象 t3="+ t3);

        // 自动拆箱
        int t4 = t2;
        // 手动拆箱
        int t5 = t2.intValue();
        System.out.println("自动拆箱，int 类型变量 t4="+ t4);
        System.out.println("自动拆箱，int 类型变量 t5="+ t5);

        // 基本数据类型转换为字符串
        String str1 = Integer.toString(t2);
        System.out.println("int 类型转换为字符串 str1="+ str1);
    }
}
