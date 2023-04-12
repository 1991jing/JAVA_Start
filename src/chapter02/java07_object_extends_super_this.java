package chapter02;

public class java07_object_extends_super_this {
    public static void main(String[] args) {
        //如果父类子类有相同属性，采用关键字区分
        //this,super
        //这两个关键字在静态代码和静态方法中不能使用，因为是对象
        Child1 c =new Child1();
        c.test();
    }
}

class Parent1{
     String name ="zhangsan";
}

class Child1 extends  Parrent{
    String name ="lisi5566";

    void test(){
        System.out.println(this.name);
        System.out.println("执行代码");
        System.out.println(super.name);
    }
}