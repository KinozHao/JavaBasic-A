package basic1;

public class AnimalTwoObject {
/*�������Ĺ�ϵ
	����������������£�ÿ��������һ�׶���������(��static)
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
		 gi=wi;	//��wi�Ķ����ֵַ��ֵ����gi
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