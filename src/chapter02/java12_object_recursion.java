package chapter02;

public class java12_object_recursion {

    public static void main(String[] args) {


        int result= dcslzhihe(10);
        System.out.println(result);

        int result2 =jiecheng(5);
        System.out.println(result2);

    }

    //所谓递归，方法自身调用自身



    //阶乘：1、0的阶乘是1；2、一个大于1的阶乘等于这个数减去1 的阶乘

    public static int jiecheng(int num){
        if (num==0){
            return 1;
        }else {
            return num*jiecheng(num-1);
        }
    }




    //等差数列之和

    public static int dcslzhihe(int num){
        num = num %2==0? num -1:num;
        if (num==1){
            return 1;
        } else {
            return num+dcslzhihe(num-2);

        }

    }


}
