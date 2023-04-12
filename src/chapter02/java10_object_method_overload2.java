package chapter02;

public class java10_object_method_overload2 {
    public static void main(String[] args) {
        //如果一个构造方法中，想要调用其他构造方法，需要用到关键字this
            User141 user= new User141();

    }
}

class User141{
    User141(){
        this ("zhangsan");
    }

    User141(String name){
        this(name,"man");

    }
    User141(String name,String sex){
        System.out.println(name+","+sex);
    }
}