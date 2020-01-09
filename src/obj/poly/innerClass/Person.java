package obj.poly.innerClass;

// 外部类
public class Person {
    int age;

    public Heart getHeart() {
        Heart heart = new Heart();
        System.out.println("内部类成员 temp："+heart.temp);
        return new Heart();
    }

    public void eat() {
        System.out.println("吃东西");
    }

    // 成员内部类
    public class Heart {
        int age = 13;
        int temp = 20;
        public String beat() {
            System.out.println( age + "心脏在跳动");
            System.out.println("外部类 age："+Person.this.age);
            return "心脏在跳动";
        }
    }

    // 静态内部类
    static class Heart2 {
        int age = 13;
        int temp = 20;

        public static void say() {
            System.out.println("say hello");
        }

        public void beat() {
            new Person().eat();
            System.out.println(age + "心脏在跳动");
        }
    }

    // 方法内部类
    public void sayHello() {
         class Heart3 {
            int age = 13;

            public final void say() {
                System.out.println("say hello");
            }

            public void beat() {
                new Person().eat();
                System.out.println(age + "心脏在跳动");
            }
        }
    }
}
