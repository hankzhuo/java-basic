package obj.createObj;

/**
 * 宠物猫类
 * @author hank
 *
 */
public class Cat {
    // 成员属性
    String name; // String 初始值 null
    int month; // int 初始值 0
    double weight; // double 初始值 0.0
    private String species; // 私有属性，实例不能直接访问

    // 创建 get/set 方法，添加对属性的限制
    public void setSpecies(String species) {
        this.species = species;
    }
    public String getSpecies() {
        return "我是"+ this.name +"，品种是:" + this.species;
    }

    // 无参构造
    public Cat() {

    }

    // 有参构造
    public Cat(String name, int month, double weight, String species) {
        // 可以直接传输参数，设置属性
        this.name = name;
        this.month = month;
        this.weight = weight;
        // 也可以通过属性 species 的劫持设置
        this.setSpecies(species);
    }

    public void run(String name) {
        System.out.println(name+ "快跑");
    }

    public void eat() {
        System.out.println("小猫吃鱼");
    }
}
