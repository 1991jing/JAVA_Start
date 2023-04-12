package chapter02;

public class java05_object_instance {
    public static void main(String[] args) {


        // TODO: 2023/4/5 构造方法 类名（）{}
        //1、构造方法也是方法，没有void关键字
        //2、方法名和类名相同
        //3、如果类中没有构造方法，JVM会提供默认的构造方法
        //4、如果类中有构造方法，JVM则不会提供默认的构造方法
        //5、构造方法也是方法，可以传递参数，但是传承的目的一般主要是给对象的属性赋值
        System.out.println("before");

        User11 user2 = new User11("zhangsan");

        System.out.println("after");


        user2.test();
        System.out.println(user2.userName);


    }


}
class User11{
    String userName;

    {
        System.out.println("代码块1");
    }

     User11(String name){

         userName = name;

         System.out.println("User11...");
     }
    {
        System.out.println("代码块2");
    }
     void test(){

         System.out.println("test...");

     }
    {
        System.out.println("代码块3");
    }
}