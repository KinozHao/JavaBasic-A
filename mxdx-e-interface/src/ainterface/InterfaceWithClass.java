package ainterface;
/**
* @apiNote �ӿ�����֮��Ĺ�ϵ
* */
public class InterfaceWithClass {

	public static void main(String[] args) {
		//�޴����ڵĶ�̬
		method(new Goo());
	}
	public static void method(Goo goo){
		goo.runs();
		goo.runs2();
		goo.runs3();
	}
}
interface jk1{
	void runs();
}
interface jk2{
	void runs2();
}
//�ӿ���ӿڿ���ʵ�ֶ�̳�
interface jk3 extends jk1,jk2{
	void runs();
	void runs3();
	void runs2();
}
//ʵ�ֽӿ��� ���Զ�ʵ��  ��ʽimplements �ӿ�����,�Դ�����
class Goo implements jk1,jk2,jk3{
	public void runs(){			//���󷽷����� ǿ����дabstract����
		System.out.println("runs1�����");
	}
	public void runs2(){		//���󷽷����� ǿ����дabstract����
		System.out.println("runs2�����");
	}
	public void runs3(){
		System.out.println("runs3�����");
	}
}
