package chapter02;

public class java08_object_duotai {
    public static void main(String[] args) {

        // TODO: 2023/4/7 面向对象-多态
        //所谓多态，其实是一个对象在不同场景表现出来的不同状态和形态
        //多态语法其实就是对对象使用场景进行约束：以父类声明的子类对象只能用父类的方法
        //一个对象可以使用的功能取决于应用的变量类型
        Person p = new Person();
        p.testPerson();
        Boy b =new Boy();
        b.testBoy();
        Girl g = new Girl();
        g.testGirl();
    }

}

class Person{
    void testPerson(){
        System.out.println("test person...");
    }
}

class Boy{
    void testBoy(){
        System.out.println("test boy...!");
    }
}

class Girl{
    void testGirl(){
        System.out.println("test gilr...");
    }
}
