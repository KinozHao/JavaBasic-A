package control.whileus;

public class whileTest {
    public static void main(String[] args) {
        int a=1; //声明一个变量
        while(a<=15){//用while语句声明a是<=15的 切记不可写为1<=15否则会发生无限循环
            System.out.println("so the a ="+a);
            a++;
        }

        System.out.println("----------------------");

        // 计算1-100的和
        int c=1;
        int b=0;
        while(c<=100){
            b=c+b;
            c++;
        }
        System.out.println("so b="+b);
    }
}
