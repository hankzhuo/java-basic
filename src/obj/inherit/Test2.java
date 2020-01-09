package obj.inherit;

public class Test2 {
    public static void main(String[] args) {
        Animal one = new Animal("花花");
        Animal two = new Animal("花花");

        // equals：继承 Object 中 equals 方法时，比较的是两个引用是否指向同一个对象
        boolean flag = one.equals(two);
        System.out.println("one 和 two 引用比较：" + flag);

        // String 类内部对 equals 进行了重写
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        flag = str1.equals(str2);
        System.out.println("str1 和 str2 引用比较：" + flag);
    }
}
