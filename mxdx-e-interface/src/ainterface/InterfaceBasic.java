package ainterface;
/**
 * @author kinoz
 * @date 2022/4/17 - 16:22
 * @apiNote
 * �ӿڲ��ܱ�ʵ��������ʵ����������ʵ����(��̬)
 * �ӿ��еķ������ǳ����(abstract�ɲ�д)
 * ʵ�ֽӿڵ������дΪ������
 * �ӿ������з���ʵ���඼��д�ˣ����Բ�д
 */
public class InterfaceBasic {
	public static void main(String[] args) {
		Plane plane = new Plane();
		plane.fly();
		plane.stop();
	}
}

interface Flyable{
	//���� public static final����ʡ�Բ�д
	int MAX_SPEED = 7200;
	int MIN_SPEED = 1;
	//���󷽷� public abstract���Բ�д
	void fly();
	void stop();
}

class Plane implements Flyable{
	@Override
	public void fly() {
		System.out.println("ͨ���ɻ��������");
	}

	@Override
	public void stop() {
		System.out.println("��������ϵͳֹͣ");
	}
}

//û��ȫ���ѽӿڵķ���ʵ�֣��������ͻ��Ǹ�������
abstract class Kite implements Flyable{
	@Override
	public void stop() {
		System.out.println("����������");
	}
}