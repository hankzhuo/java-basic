package obj.poly.interfaceDemo;

public interface IPlay {
    // 接口中抽象方法可以不写 abstract 关键字，修饰符默认 public、abstract
    void play();

    // 接口中可以包含常量，默认 public static final
    int TEMP = 20;

    // default：默认方法，可以带方法体，JDK1.8 新增
    // 可以在实现类中重写，并可以通过接口的调用引用
    default void play1() {
        System.out.println("接口方法：玩1");
    }

    // static：静态方法，可以带方法体，JDK1.8 新增
    // 不可以在实现类中重写，可以通过接口的调用引用
    static void play2() {
        System.out.println("接口方法：玩2");
    }
}
