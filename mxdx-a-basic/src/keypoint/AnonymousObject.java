package keypoint;

public class AnonymousObject {
	//匿名对象的使用
	public static void main(String[] args) {
		/*basic.keypoint.money num=new basic.keypoint.money();//创建有名字的对象
		num.print();
		num.print();
		new basic.keypoint.money().print();//匿名对象只适合对方法的一次调用,应为调用多次就会产生多个对象,不如有名对象
		new basic.keypoint.money().print();*/ //匿名对象调用方法
		new money().country="USD";
		new money().how=100;
		new money().print();
	}
}
class money{
	String country;
	int how;
	public void print(){
		System.out.println(country+".go."+how);
	}
}
