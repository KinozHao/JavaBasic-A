package basictest;

public class 重载两个数是否相同 {
	public static void main(String[] args) {
	boolean a1=same(98,89);
	boolean a2=same(98,98);
	System.out.println(a1);
	System.out.println(a2);
	}
	public static boolean same(int aa,int bb){
		return aa==bb;
	}
	public static boolean same(double aa,double bb){
		return aa==bb;
	}
}