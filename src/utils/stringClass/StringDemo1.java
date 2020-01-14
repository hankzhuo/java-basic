package utils.stringClass;

public class StringDemo1 {
    public static void main(String[] args) {
        String str = "JAVA 基础编程";
        System.out.println("str 字符串长度："+ (str.length()));
        System.out.println((str.charAt(6)));
        System.out.println((str.substring(5)));
        System.out.println((str.substring(5, 9)));
        System.out.println("字符 A 在字符串中第一次出现的位置："+ (str.indexOf("A")));

        String str1 = "hank";
        String str2 = "hank";
        String str3 = new String("hank");
        System.out.println("str1 和 str2 内容相同？"+ (str1.equals(str2)));
        System.out.println("str2 和 str3 内容相同？"+ (str2.equals(str3)));

        System.out.println("str1 和 str2 地址相同？"+ (str1 == str2)); // 常量池中同一个地址
        System.out.println("str2 和 str3 地址相同？"+ (str2 == str3));
    }
}
