package obj.inherit;

public class Dog extends Animal{
    private String sex; // 性别

    public Dog(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    // 睡觉方法
    public void sleep() {
        // eat(); // 调用的是本类方法
        // super.eat();  // super 可以调用父类中的 eat 方法
        System.out.println(this.getName() + "在睡觉~");
    }
    // 方法重写，覆盖父类中 eat 方法
    @Override
    public void eat() {
        System.out.println(this.getName() + "不想吃东西~");
    }
}
