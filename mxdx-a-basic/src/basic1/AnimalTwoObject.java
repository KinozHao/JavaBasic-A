package basic1;

public class AnimalTwoObject {
/*多个对象的关系
	创建多个对象的情况下，每个对象都有一套独立的属性(非static)
 */
	public static void main(String[] args) {
		 animals ki=new animals();
		 ki.kind="cat";
		 ki.num=4;
		 ki.run();
		 animals wi=new animals();
		 wi.kind="monkey";
		 wi.num=2;
		 wi.runs();
		 animals gi=new animals();
		 gi=wi;	//把wi的对象地址值赋值给了gi
		 gi.runs();
	}

}
class animals{
	String kind;
	int num;
	public void run(){
		System.out.println(kind+" hava "+num+"legs");
	}
	public void runs(){
		System.out.println(kind+" hava "+num+"legs");
	}
}