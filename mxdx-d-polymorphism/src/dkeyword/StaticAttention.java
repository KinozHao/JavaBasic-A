package dkeyword;
/**
* @apiNote static�ؼ���ʹ�õ�ע������
* */
public class StaticAttention {
	public static void main(String[] args) {
		staticss n=new staticss();
		n.runs();
		staticss.run();
	}

}
class staticss {
	int num1 = 1;
	static int num2 = 2;

	public void runs(){//�Ǿ�̬�ĳ�Ա����
		System.out.println(num1);//�Ǿ�̬�ķ��� ��̬���ԺͷǾ�̬���ɵ���
		System.out.println(num2);
	}
	public static void run(){//��̬�ķ��� ֻ�ܵ��þ�̬������
		//System.out.println(num1);
		System.out.println(num2);
	}
}
