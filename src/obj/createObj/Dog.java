package obj.createObj;

public class Dog {
    String name;
    static int prices; // static + 属性 => 静态属性、类属性，对象实例化公用该属性

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(String name) {
        {
            int temp = 24; // 局部变量
            System.out.println("局部变量 temp="+ temp);
        }
        System.out.println(name + "快跑");
    }

    // static + 方法 => 静态方法、类方法
    public static void eat() {
        // run(); // 静态方法中不能直接访问非静态成员，但可以直接调用静态成员
        // this.name = "啪啪"; // 静态方法中不能使用 this
        // static int temp = 13;  // 不存在方法中的静态局部变量
        System.out.println("小狗吃饭");
    }
    // 构造代码块
    {
        System.out.println("我是构造代码块 1");
    }
    // 静态代码块
    static {
        System.out.println("我是静态代码块 2");
    }
}
