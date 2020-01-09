package obj.inherit;

import obj.inherit.Animal;
import obj.inherit.Cat;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat(10);
        cat1.setName("小花猫");
        cat1.eat();
        cat1.run();
        System.out.println(cat1.temp); // 子类中的 temp

//        Dog dog1 = new Dog("母");
//        dog1.setName("二哈");
//        dog1.eat();
//        dog1.sleep();
//
    }
}
