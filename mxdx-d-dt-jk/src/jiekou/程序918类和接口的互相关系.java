package jiekou;

public class ����918��ͽӿڵĻ����ϵ {

	public static void main(String[] args) {
		method(new gogo());				//����ʵ��
	}
	public static void method(gogo s){	//����
		s.runs();
		s.runs2();
		s.runs3();
	}
}
interface jk1{		//�ӿ�
	public abstract void runs();
}
interface jk2{		//�ӿ�
	public abstract void runs2();
}
interface jk3 extends jk1,jk2{		//�ӿ���ӿڿ���ʵ�ֶ�̳�
	public abstract void runs3();
	public void runs();
	public void runs2();
}
class gogo implements jk1,jk2,jk3{	//ʵ�ֽӿ��� ���Զ�ʵ��  ��ʽimplements �ӿ�����,�Դ�����
	public void runs(){			//���󷽷����� ǿ����дabstract����
		System.out.println("GUCCI");
	}
	public void runs2(){		//���󷽷����� ǿ����дabstract����
		System.out.println("Go???");
	}
	public void runs3(){
		System.out.println("Gogo");
	}
}
