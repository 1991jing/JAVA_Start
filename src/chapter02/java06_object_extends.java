package chapter02;

public class java06_object_extends {
    public static void main(String[] args) {
        // TODO: 2023/4/5    Extends--继承
        //面向对象重要特征：继承、封装、多态
        //类存在父子关系：子类可以直接继承父类的成员属性和成员方法
        //类的继承只能是单继承，一个类只有一个父类，不能存在多个父类
        //一个父类可以存在多个子类
        //继承采用Extends语法：子类 extends 父类

        Child c = new Child();
        System.out.println("子类的父类名称属性是"+c.name);
    }
}

class Parrent{
    String name ="zhangsan";
    void test(){
        System.out.println("test");
    }
}

class Child extends Parrent{

}