package chapter03;

//java: 不再支持源选项 6。请使用 7 或更高版本。https://blog.csdn.net/weixin_44241773/article/details/127332009

import java.sql.SQLOutput;



//枚举是一个特殊的类，其中包含了一组特定的对象，这些对象不会发生改变，一般都使用大学标识符
//枚举关键子enum
//枚举将对象放置最前面，需要和后面的语法用分号分隔
//枚举类不能创建对象，它的对象在内部自行创建



public class java23_obeject_enum {
    public static void main(String[] args) {
        System.out.println(City.BEIJING.name);
        System.out.println(City.BEIJING.code);
    }

}

// TODO: 2023/4/23 用类的方式写枚举 
class MyCity{
    
}



enum City{
    
    BEIJING("beijing",10001),
    SHANGHAI("shanghai",10002),
    GUANGZHOU("guangzhou",10003);

    City(String name,int code) {
        this.name =name;
        this.code =code;

    }
    public String name;
    public int code;
}