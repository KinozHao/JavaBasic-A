package jiekou;
public class Girls {
	public static void main(String[] args) {
		method(new Thegirls());
	}
	public static void method(Thegirls a){
		a.relation();
		a.rule();
	}
}
//The girls and with the Nfather
//only father is single extends
//Nfather Have many implements
interface Nfather{						//接口
	public abstract void relation();
	public abstract void rule();
}
class Thegirls implements Nfather{		//接口实现
	public void relation(){
		System.out.println("Get more power from the Nfather");
	}
	public void rule(){
		System.out.println("All of yours know the rule");
	}
}
