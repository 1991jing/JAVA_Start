package chapter02;

public class java11_object_method_rewriting {
    public static void main(String[] args) {
        ccc N =new ddd();

        System.out.println(N.sum());//30
    }
    // TODO: 2023/4/8 方法重写
    //一个对象能使用什么方法，取决于引用变量的类型
    //一个对象能使用什么属性，取决于引用变量的类型
    //一个对象的方法使用，需要看具体的对象
    //一个对象的属性使用是不需要看具体对象的，属性在哪里声明就在哪里使用

}

class  ccc{
        int i =10;
        int sum(){
            return getI() + 10;
        }
        int getI(){
            return i;
        }
}

class ddd extends ccc{
    int i = 20;
//    int sum(){
//        return i+20;
//    }
    int getI(){
        return i;
    }
}