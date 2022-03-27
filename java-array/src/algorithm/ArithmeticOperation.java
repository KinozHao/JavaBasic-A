package algorithm;

//算数运算 最大值 最小值 平均值 和
public class ArithmeticOperation {
    public static void main(String[] args) {
        int arr [] = new int[10];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (int)(Math.random()*(99-10+1)+10); //生成十个不同的随机数不超过2位数
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+ ",");
        }
        System.out.println();

        //最大值
        int MaxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (MaxValue < arr[i]){
                MaxValue = arr[i];
            }
        }
        System.out.println("最大值是: "+MaxValue);

        //最小值
        int MinValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (MinValue > arr[i]){
                MinValue = arr[i];
            }
        }
        System.out.println("最小值是: "+ MinValue);

        //总和
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }
        System.out.println("总和为:"+sum);

        //平均值
        int avgValue = sum / arr.length;
        System.out.println("平均值: "+ avgValue);
    }
}