package chapter01;
// TODO: 2023/3/28 打印九层妖塔练习
/*   *
    ***
   *****
  *******
 *********
*/

public class java02_FlowControl_Test {
    public static void main(String[] args) {


        //层数
        int level =9;
        for ( int i = 0; i < level; i++) {
            //5层>每层*数>空格数：
            //1>1>4
            //2>3>3
            //3>5>2
            //4>7>1
            //5>9>0
            for(int j=0;j<level-i;j++){
                System.out.print(" ");

            }
            //*数：1,3,5,7...
            //0>1
            //1>3
            //2>5
            //3>7
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }



        }
    }













