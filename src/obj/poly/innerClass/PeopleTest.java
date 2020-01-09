package obj.poly.innerClass;

public class PeopleTest {
    public static void main(String[] args) {
        Person lili = new Person();
        lili.age = 20;

        System.out.println("======成员内部类======》");
        // 获取成员内部类对象实例，方法 1
        // Person.Heart myHeart = new Person().new Heart();
        // myHeart.beat();

        // 获取成员内部类对象实例，方法 2
        // Person.Heart myHeart = lili.new Heart();
        // myHeart.beat();

        //  获取成员内部类对象实例，方法 3
        Person.Heart myHeart = lili.getHeart();
        myHeart.beat();

        System.out.println("======静态内部类======》");
        // 获取静态内部类
        Person.Heart2 myHeart2 = new Person.Heart2();
        myHeart2.beat();
        Person.Heart2.say();
    }
}
