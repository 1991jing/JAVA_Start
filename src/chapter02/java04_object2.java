package chapter02;

public class java04_object2 {

    public static void main(String[] args) {
         Dagongren d = new Dagongren();
         d.name="zhangsan";
         d.execute();

         Dagongren d2 =new Dagongren();
         d2.name="lisi";
         d2.execute();

    }

}

class Dagongren{

    String name;

    void execute(){
        System.out.println("打工人姓名是："+name);
    }
}
