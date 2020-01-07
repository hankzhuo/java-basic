package obj.inherit;

public class Animal {
    /**
     * private：只允许在本类中访问
     * public：允许在任意位置访问
     * protected：允许在当前类、同包子类/非子类、跨包子类调用、跨包非子类不允许
     * 默认：允许在当前类、同包子类、跨包子类不允许
     */
    private String name; // 昵称
    protected int month; // 月份
    String species; // 品种
    public int temp = 14;

    static {
        System.out.println("我是父类的静态代码块");
    }

    {
        System.out.println("我是父类的构造代码块");
    }

    public Animal() {
        System.out.println("我是父类的无参构造");
    }

    // 父类的构造方法是不允许被继承，不允许被重写，但会影响子类实例化
    public Animal(String name) {
        System.out.println("我是父类的带参构造");
        this.setName(name);
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    // 吃东西
    public void eat() {
        System.out.println(this.getName() + "吃东西");
    }
}
