package obj.inherit;

public class Cat extends Animal {
    private double weight; // 体重
    public int temp = 15; // 重写父类中属性 temp

    static {
        System.out.println("我是子类的静态代码块");
    }

    {
        System.out.println("我是子类的构造代码块");
    }

    public Cat() {
        System.out.println("我是子类的无参构造");
    }

    public Cat(double weight) {
        // super("哈皮"); // 子类构造默认调用父类无参构造，但是如果子类构造中使用 super() 可以选择调用有参构造
        System.out.println("我是子类的带参构造");
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 跑动的方法
    public void run() {
        System.out.println(this.getName() + "在奔跑~");
    }

    public static void say() {
        // this.temp= 16; // static 方法内不能使用 this 和 super
    }
}
