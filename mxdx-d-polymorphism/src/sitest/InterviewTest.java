package sitest;

/**
 * @author kinoz
 * @date 2022/4/8 - 20:24
 * @apiNote 面试小问题 输出是什么
 */
public class InterviewTest {
    public static void main(String[] args) {
        faze fe = new zil();
        fe.add(10,2,3,4,2,2,1); //result zil

        if (fe instanceof  zil) {
            zil z = (zil) fe;
            z.add(1, 2, 3);     //result zil222
        }
    }
}

/**
* @apiNote 构成方法的重写 可变形参讲过这个问题 ...和[]是一个意思
* */
class faze{
    public void add(int a,int ... arr){
        System.out.println("faze");
    }
}

class zil extends faze{
    @Override
    public void add(int a, int[] arr) {
        System.out.println("zil");
    }

    //对于本类来说构成重载 对于父类来说不构成重写
    public void add(int a, int b,int c) {
        System.out.println("zil222");
    }
}
