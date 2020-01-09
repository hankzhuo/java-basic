package obj.poly;

public abstract class Animal {
    private String name; // 昵称
    protected int month; // 月份

    public Animal() {
    }

    public Animal(String name, int month) {
        this.setName(name);
        this.setMonth(month);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    // 抽象方法，子类必须重写该方法
    public abstract void eat();

    public void drink() { System.out.println("动物要喝水"); }
    // 父类的静态方法无法被子类重写
    public static void say() {
        System.out.println("动物打招呼");
    }
}