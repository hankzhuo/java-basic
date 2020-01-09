package obj.poly;

import obj.poly.interfaceDemo.ISon;
import obj.poly.interfaceDemo.IPlay;

public class Cat extends Animal implements IPlay, ISon {
    private double weight; // 体重

    public Cat() {

    }

    public Cat(String name, int month, double weight) {
        super(name, month); // 调用父类构造方法
        this.setWeight(weight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 跑动的方法
    public void run() {
        System.out.println("猫儿在奔跑~");
    }
    // 重写父类抽象方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼~");
    }

    public static void say() {
        System.out.println("猫咪打招呼");
    }
    // 接口重写方法
    @Override
    public void play() {
        IPlay.super.play1(); // 调用接口中默认方法
        System.out.println("猫咪在玩~接口重写");
    }
}
