/**
 * @author kinoz
 * @date 2022��4��16��21��55��
 * @apiNote ����Ļ���ʹ��
 */

public class AbstractBasic {
	public static void main(String[] args) {
		//�����಻��ֱ��ʵ������һ�㶼�������෽��ȥʵ��
		aHuman aHuman = new Freshman("������",19);
		System.out.println(aHuman);
		aHuman.eat();
		aHuman.learn();
	}
}

abstract class aHuman{
	String name;
	int age;
	//�������Լ��޷�ʵ�������󣬵������������Ҫʹ�ø���Ĺ�����
	public aHuman(String name,int age){
		this.name = name;
		this.age = age;
	}

	//���󷽷�û�з�����
	public abstract void eat();
	public abstract void learn();

	@Override
	public String toString() {
		return "Freshman{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}

class Freshman extends aHuman{
	//������Ȼ��abstract���������Կ���ʹ�ø���Ĺ�����
	public Freshman(String name,int age){
		super(name,age);
	}

	//�������ǹ��췽�������������д����Ĺ��췽��
	@Override
	public void eat() {
		System.out.println("ѧ������ԣ�����ȡ�");
	}

	@Override
	public void learn() {
		System.out.println("��һ��������ѧϰ������ȥ�棡��");
	}

}