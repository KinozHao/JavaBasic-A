package control.whileus;
public class TextFile1 {
    public static void main(String[] args) {
        //求1-100以内的偶数
        int i =1;
        while (i<=100){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }

        //说明:do while最少会执行一次循环体
        int f = 10;
        do {
            System.out.println("de while implement");
            f--;
        }while (f > 10);

        int ft = 10;
        while (ft >10){
            System.out.println("while implement");
            ft--;
        }
    }
}
