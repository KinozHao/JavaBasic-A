public class 程序805类的继承特点 {
	public static void main(String[] args) {
		//查看所用功能最下面类创建对象
		c1 d=new c1();//新建对象
		d.show();//调用成员方法
		//查看共性功能看最顶层的类
		a1 e=new a1();
		e.show();
		
	}
}
class a1{//类1
	public void show(){
		System.out.println("this is a1");
	}
}
class b1 extends a1{//类2
	public void show(){
		System.out.println("this is b1");
	}
}
//Java只支持单继承所以说 extends a1,b的写法格式是不对的
class c1 extends b1/*,b*/{//类3继承了类1的show方法并在主方法中调用
	public void print(){
		System.out.println("this is c1");
	}
}