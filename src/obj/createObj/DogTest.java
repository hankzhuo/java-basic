package obj.createObj;

import obj.createObj.Dog;

public class DogTest {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.setName("二哈");
        // one.prices = 1000;
        Dog.prices = 5000; // 对静态属性，使用类调用

        Dog two = new Dog();
        two.setName("金毛");

        System.out.println(one.getName() + "价格为：" + Dog.prices);
        System.out.println(two.getName() + "价格为：" + Dog.prices);
    }
}

