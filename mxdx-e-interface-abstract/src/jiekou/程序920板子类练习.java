package jiekou;
public class 程序920板子类练习 {
	public static void main(String[] args) {
		method(new board());		//method achieve
		method2(new advboard());	//method achieve
	}
	public static void method(board a){		//method BOARD
		a.using();
		a.kinds();
		a.setcand("Yboard");
		a.setprice(45);
		System.out.println("name:"+a.getcand()+"price:"+a.getprice()+"$");
	System.out.println("-------------------------------------------");
}
	public static void method2(advboard b){	//method ADV BOARD
		b.bigone();
		b.using();
		b.kinds();
		b.setcand("diamond board");
		b.setprice(45000);
		System.out.print("Name:"+b.getcand()+"Price:"+b.getprice()+"$");
	}
}
abstract class tools{	//ABSTRACT CLASS
	private String cand;	//member variable
	private int price;		//member variable
	public tools(){}		//parametric structure
	public tools(String cand,int price){
		this.cand=cand;
		this.price=price;
	}
	//method set xxx and get xxx
	public void setcand(String cand){
		this.cand=cand;
	}
	public String getcand(){
		return cand;
	}
	public void setprice(int price){
		this.price=price;
	}
	public int getprice(){
		return price;
	}
	public abstract void using();
	public abstract void kinds();
}
interface relax{					//the interface
	public abstract void bigone();	//the member method in the interface
}									//must be abstract class
class board extends tools{			//inheritance father and son
	public board(){};				//parametric structure
	public board(String cand,int price){
		super(cand,price);
	}
	public void using(){			//father class force method
		System.out.println("用途:relax the small mechine");
	}
	public void kinds(){	
		System.out.println("大小:The small kinds");
	}
}
class advboard extends board implements relax{//多实现 多继承
	public advboard(){}
	public advboard(String cand,int price){
		super(cand,price);
	}
	public void bigone(){
		System.out.println("advboard亮点:Can relax the adv and big machine");
	}
}