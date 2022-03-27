package whilexunhuan;
//100以内质数的输出
//优化版
public class primeNumber2 {
    public static void main(String[] args) {
        //current方法用法:获取当前时间距离1970-1-1 0:00:00的毫秒数
        long start = System.currentTimeMillis();

        //count用于获取有多少个质数
        int count = 0;
        label:for (int i = 2; i <= 100000 ; i++) {
            //根号函数优化运行速度
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if (i % j == 0 ){
                    continue label;
                }
            }
            //能执行到此步骤的都是质数
            count++;
        }
        long end = System.currentTimeMillis();
        System.out.println("质数有多少个:"+count);
        System.out.println("所花费的时间:"+(end-start)+"单位:毫秒");
    }
}
