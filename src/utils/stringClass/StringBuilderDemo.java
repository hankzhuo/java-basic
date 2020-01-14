package utils.stringClass;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("你好");
        // append 方法
        str.append(",Java");
        System.out.println(str);

        // delete 方法
        str.delete(2,7).insert(2, "小猫");
        System.out.println(str);

        // replace 方法
        str.replace(2,4,"Java!");
        System.out.println(str);
    }
}
