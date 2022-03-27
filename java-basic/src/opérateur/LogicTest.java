package opérateur;
//逻辑运算符
public class LogicTest {
    public static void main(String[] args) {
        methodYV();
        System.out.println("[***************************]");
        methodHUO();
        //开发中推荐使用||和&&
        logicsQuestion();

    }

    private static void logicsQuestion() {
        boolean x =true;
        boolean y =false;
        short z = 42;
        /*加号在后,先自身加1再做比较 左:false
        右：false
        短路与左边为false右边不执行
        */
        if((z++ == 42)&&(y = true)){
            z++;    //z==44现在
            //短路或左边false右边继续执行
            if ((x = false)||(++z==45)){    //z==45
                z++; //z==46

            }
        }
        System.out.println("最终打印结果：z = "+z);
    }

    private static void methodHUO() {
        // |与||的区别
        // 相同点1 |与||的输出结果相同
        // 相同点2 当符号左边为false时候,两者都会执行符号右边的运算
        // 不同点  当符号左边是true的时候 |会继续执行右边的运算而||不会执行
        boolean bl3 = true;
        //bl3 = false;
        int a3 = 10;
        if (bl3 | (a3++>0)){
            System.out.println("Tokyo");
        }else{
            System.out.println("Peking");
        }
        System.out.println(a3);

        boolean bl4 = true;
        //bl4 = false;
        int a4 = 10;
        if (bl4 || (a4++>0)){
            System.out.println("Tokyo");
        }else{
            System.out.println("Peking");
        }
        System.out.println(a4);
    }


    private static void methodYV() {
        // &与&&的区别
        // 相同点1 &与&&的输出结果相同
        // 相同点2 当符号左边为true时候,两者都会执行符号右边的运算
        // 不同点  当符号左边是false的时候 &会继续执行右边的运算而&&不会执行
        boolean bl = true;
        bl = false;
        int a = 10;
        if (bl & (a++>0)){
            System.out.println("Tokyo");
        }else{
            System.out.println("Peking");
        }
        System.out.println(a);

        boolean bl2 = true;
        bl2 = false;
        int a2 = 10;
        if (bl2 && (a2++>0)){
            System.out.println("Tokyo");
        }else{
            System.out.println("Peking");
        }
        System.out.println(a2);
    }
}
