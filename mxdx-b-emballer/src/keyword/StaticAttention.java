package keyword;
/**
* @apiNote static�ؼ���ʹ�õ�ע������
* */
public class StaticAttention {
	public static void main(String[] args) {
		oh n=new oh();
		n.runs();
		oh.run();
	}

}
class oh{
	int num1=1;//�Ǿ�̬�ĳ�Ա����
	static int num2=2;//��̬�ĳ�Ա����
	public void runs(){//�Ǿ�̬�ĳ�Ա����
		System.out.println(num1);//�Ǿ�̬�ĳ�Ա���� �ȿ��Է��ʾ�̬�ĳ�Ա Ҳ���Է��ʷǾ�̬�ĳ�Ա
		System.out.println(num2);
	}
	public static void run(){//��̬�ĳ�Ա����
		//System.out.println(num1);
		System.out.println(num2);
	}
}
