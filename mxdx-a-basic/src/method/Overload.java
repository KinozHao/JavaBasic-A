package method;

/**
 * @author kinoz
 * @date 2022/3/24 - 16:51
 * @apiNote 方法重载的体现
 * @apiNote 方法名可以相同 内部参数个数和类型不同即可
 */
public class Overload{
    public static void main(String[] args) {
        Overload od = new Overload();
        double max = od.Max(23,53,554);
        System.out.println(max);
    }
    public void mOL(int i){
        System.out.println(i*i);
    }
    public void mOl(int i,int j){
        System.out.println(i*j);
    }
    public void mOl(String s){
        System.out.println(s);
    }

    public int Max(int i,int j){
        return Math.max(i,j);
    }
    public double Max(double i,double j){
        return Math.max(i,j);
    }
    public double Max(double i,double j,double l){
        double max = (i > j)? i:j;
        return Math.max(max,l);
    }
}
