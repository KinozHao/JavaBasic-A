package classmembers;/*
* �ڲ���Ļ���ʹ��
* */

public class InnerClassBasic {
	public static void main(String[] args) {
		//��̬ʵ����
		Human.Brain brain = new Human.Brain();
		brain.bMethod();
		System.out.println("-----------");


		//�Ǿ�̬��ʵ����
		Human person = new Human();
		Human.Stomach stomach = person.new Stomach();
		stomach.sMethod();
		System.out.println("-----------");
		stomach.display("The Brain");

	}
}
class Human {	//�ⲿ��
	String name = "Jack";
	static public void eat(){
		System.out.println("�˳Է�");
	}

	//��̬�ڲ���
	static class Brain {

		public void bMethod(){
			System.out.println("Hello word");
		}
	}

	//��Ա�ڲ���
	class Stomach {
		String name ="Rose";
		public void sMethod(){
			System.out.println("Hello word");
			//�ڲ�������ⲿ��ȫд
			Human.this.eat();
		}

		public void display(String name){
			//�������β�
			System.out.println(name);
			//�ڲ��������
			System.out.println(this.name);
			//�ⲿ�������
			System.out.println(Human.this.name);
		}
	}

	//�ֲ��ڲ���
	{
		class a{

		}
	}
	public Human(){
		class b{

		}
	}
	public void methodss(){
		class c{

		}
	}
}
