package chapter02;

public class java03_object {
    public static void main(String[] args) {

        Cooking c =new Cooking();
        c.food="排骨";
        c.name="红烧排骨";
        c.execute();

    }
}


class Cooking{
    //属性
    String name;
    String type="红烧";
    String relish="大葱+姜丝";
    String food;
    //方法
    void execute(){
        System.out.println("准备食材:"+food);
        System.out.println("准备佐料:"+relish);
        System.out.println("开始烹饪");
        System.out.println(name+"烹饪结束");
    }

}