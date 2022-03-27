public class 程序706创建一个对象的步骤 {

	public static void main(String[] args) {
		xsheng s=new xsheng();
		s.show();
	}

}
class xsheng{
	String name="李魁";
	int age=48;
	public xsheng(){
		name="武松";
		age=56;
	}
	public void show(){
		System.out.println(name+"是个狠人,今年"+age+"打老虎贼厉害");
	}
}
