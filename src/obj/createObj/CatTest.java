package obj.createObj;

import obj.createObj.Cat;

public class CatTest {
    public static void main(String[] args) {
        // 对象实例化
        Cat cat1 = new Cat("花花", 1, 1.1, "英短");
        cat1.eat();
        cat1.run(cat1.name);
        cat1.weight = 4;

        // cat1.species = "田园猫"; species 是 private 私有属性，不能直接访问
        cat1.setSpecies("田园猫");

        System.out.println("猫姓名："+ cat1.name);
        System.out.println("猫年龄："+ cat1.month);
        System.out.println("猫体重：" + cat1.weight);
        System.out.println("猫品种：" + cat1.getSpecies());
    }
}
