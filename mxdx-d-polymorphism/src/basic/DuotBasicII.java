                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            package basic;
public class DuotBasicII {
	public static void main(String[] args) {
		peoples ss=new japan();;
		//开发时候很少在创建对象的时候用父类引用指向子类对象,直接创建子类对象更方便
		//可以使用子类中特有的属性和行为
		//方法调用
		mathod(new japan());
		mathod(new china());
	}
	//方法的使用
//	public static void mathod(japan c){
//		c.person();
//	}
//	public static void mathod(china d){
//		d.person();
//	}
	//当作参数的时候用参数最好,应为扩展性强
	public static void mathod(peoples e){//调用父类方法
		//e.eatj();	//父类无法使用子类成员方法 如果在父类中写一个的话也不合适
		e.person();
		/*If you want all of the countrys eat the Sushi not ture
		 a type conversion exception will occur"ClassCastException"*/
		/*japan f=(japan)e;
		f.person();
		f.eatj();*/
		//关键字instanceof 判断前面的引用是否是后面的数据类型
		//开发一般不这么使用 直接接受父类类型 传对应的子类型即可
		if(e instanceof japan){
			japan g=(japan)e;
			g.person();
			g.eatj();
		}else if(e instanceof china){
			china h=(china)e;
			h.person();
			h.eatc();
		}else{
			e.person();
		}
	}
}
class peoples{//父类
	public void person(){
		System.out.println("all of yours are person");
	}
}
class japan extends peoples{//子继承父类
	public void person(){
		//super.person();	super调用父类成员方法
		System.out.println("I,m japanese");
	}
	public void eatj(){
		System.out.println("We eat Sushi");
	}
}
class china extends peoples{
	public void person(){
		System.out.println("I,m Chinese");
	}
	public void eatc(){
		System.out.println("We eat jiaozi");
	}
}