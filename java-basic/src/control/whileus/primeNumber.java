package control.whileus;
//100以内质数的输出
public class primeNumber {
    public static void main(String[] args) {
        //current方法用法:获取当前时间距离1970-1-1 0:00:00的毫秒数
        long start = System.currentTimeMillis();
        int count = 0;
        boolean isFlag = true;      //判断标识，i是否能够被j除尽，一旦能出除尽就改变其值为false
        for (int i = 2; i <=100000 ; i++) {
            //优化2:利用根号函数sqrt
            for (int j = 2; j <= Math.sqrt(i); j++) {   //j:被i去除
            //for (int j = 2; j < i; j++) {   //j:被i去除
                if (i % j == 0){
                    isFlag = false;
                    break;  //优化1：只对本身非质数的自然数有效
                }
            }
            if (isFlag == true){    //i被j除尽
                //System.out.println(i);
                count++;
            }
            isFlag = true;  //标识重置
        }
        long end = System.currentTimeMillis();
        System.out.println("质数有多少个:"+count);
        //sqrt函数:20毫秒 break:1280 无算法:13534
        System.out.println("所花费的时间:"+(end-start)+"单位:毫秒");
    }
}
