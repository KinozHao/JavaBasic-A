package opérateur;
//赋值运算符
public class SetValueTest {
    public static void main(String[] args) {

        //连续赋值
        int a,b;
        a=b=10;
        int a1=100,b1=200;
        System.out.println(a+b+a1+b1);

        //其不会改变本身的数据类型
        int a3 =10;
        a3 +=2;
        System.out.println(a3);
        a3 -=2;
        System.out.println(a3);
        a3 *=2;
        System.out.println(a3);
        a3 /=2;
        System.out.println(a3);
        a3 %=2;
        System.out.println(a3);

        System.out.println("-------------");

        //开发中变量实现+2的操作前提 int num=10;
        int num =10;
        num +=2;//推荐用法
        num = num+2;
        //实现+1的操作
        num++; //推荐用法
        num +=1;
        num = num+1;
        System.out.println(num);

    }
}
