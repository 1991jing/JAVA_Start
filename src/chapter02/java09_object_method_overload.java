package chapter02;

public class java09_object_method_overload {
    public static void main(String[] args) {

        // TODO: 2023/4/7 面向对象-方法重载
        //一个类中，不能重复声明相同的方法，也不能声明相同的属性
        //这里的相同是指方法名、传参列表的相同，与返回类型无关
        //如果方法名称相同，但是参数列表不同（个数，顺序，类型），会认为是不同的方法，方法名称不同而已
        //这个操作在JAVA中称为方法的重载
        //构造方法也可以重载

        User10 user_login =new User10("jing");
        user_login.login("zhangsan","lisi");

        user_login.login("wx");

        user_login.login(123);




    }
}

class User10{
    //构造方法
    User10(){
        System.out.println("user10");
    }

    User10(String name){
        System.out.println("user10 is "+name);
    }

    void login(String account,String password){
        System.out.println("账号、密码登录");
    }
    void login(int tel){
        System.out.println("手机登录");
    }
    void login(String wx){
        System.out.println("微信登录");
    }
}