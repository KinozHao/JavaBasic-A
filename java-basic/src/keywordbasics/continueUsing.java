package keywordbasics;
//continue的用法只能在循环中
public class continueUsing {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 3){
                //结束本次循环，继续下次循环
                continue;
            }
            System.out.println(i);
        }
        System.out.println("---------------");


        fory:for (int i = 1; i <= 4; i++) {
            fore:for (int j = 1; j <= 5; j++) {
                if (j == 4){
                    //1,结束内层循环，执行下一次循环。打印四行四列
                    //continue fore;
                    //2,结束外层循环，j=4时候结束本次循环，然后执行下次循环。3*4=12
                    continue  fory;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
