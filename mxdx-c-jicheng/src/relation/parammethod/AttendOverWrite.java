package relation.parammethod;
//方法重写的注意事项
public class AttendOverWrite {
	public static void main(String[] args) {
		oth s=new oth();
		s.sing();
		s.getgirl();
	}
}
class shuangjiang{
	public void sing(){
		System.out.println("唱红歌");
	}
	//如果为private就不能被调用
	public void getgirl(){
		System.out.println("唱红歌搞定easygirl");
	}
}
class oth extends shuangjiang{
	public void getgirl(){
		super.getgirl();
		System.out.println("霸王硬上弓");
	}
}