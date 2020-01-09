package obj.poly;

import obj.poly.Animal;
import obj.poly.interfaceDemo.IPlay;

public class Test {
    public static void main(String[] args) {
        // 向上转型（隐式转型、自动转型）
        Animal cat1 = new Cat();
        cat1.drink();
        cat1.eat(); // 调用子类重写父类的方法
        cat1.say(); // 调用父类静态方法
        cat1.setMonth(2); // 调用父类方法 setMonth
        // cat1.setWeight(1.1); // 无法调用子类方法
        System.out.println("==================");

        // 向下转型（强制类型转换）
        if (cat1 instanceof Cat) {
            Cat cat2 = (Cat)cat1;
            cat2.eat(); // 调用子类方法
            cat2.run(); // 调用子类方法
            cat2.drink(); // 调用父类方法
            cat2.say(); // 调用子类静态方法
            cat2.play();
        }
        if (cat1 instanceof Animal) {
            System.out.println("cat1 是 Animal 类型");
        }
        System.out.println("==================");

        // 接口
        System.out.println("接口变量 temp："+ IPlay.TEMP);

    }
}
