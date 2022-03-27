package forxunhuan;
/*
* 编译程序1循环到150，打印每一个值
* 3倍数行打印hzz
* 5倍数行打印bjj
* 7倍数行打印shh
* */
public class ForTestFile {
    public static void main(String[] args) {
        for (int i = 0; i <=150 ; i++) {
            System.out.print(i+"  ");
            if (i % 3 == 0){
                System.out.print("hzz");
            }

            if (i % 5 == 0){
                System.out.print("bjj");
            }

            if (i % 7 == 0){
                System.out.print("shh");
            }

            //换行
            System.out.println();
        }
    }
}
