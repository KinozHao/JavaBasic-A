package keywordbasics;
//break的用法，可以在switch或者循环体中使用、

public class breakUsing {
    public static void main(String[] args) {
        //跳出单层循环
        for (int i =1;i < 10;i++){
            if (i == 6){
                break;
            }
            System.out.print(i+",");
        }

        //跳出多层循环
        foa:for (int i = 1;i <=4;i++){
            fob:for (int j = 1; j <=6 ; j++) {
                if (j == 4){
                    //break fob;    //跳出内层循环，即结束本次打印，只打印四行三列
                    break  foa;     //跳出外层循环，即结束本次打印，只打印1行3列
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
