//�����ڲ���ֻ�����дһ������ʱ��ʹ��
//��д���������ʱ���Ƽ�ʹ�ô����¶���
public class ����114�����ڲ�����д����������� {
	public static void main(String[] args) {
		w aaa=new w();
		aaa.print();
	}
}
interface jk2{
	public void method1();
	public void method2();
}
class w{
	class n implements jk2{
		public void method1(){
			System.out.println("����Ƿ���1");
		}
		public void method2(){
			System.out.println("����Ƿ���2");
		}
	}
	public void print(){
		new n().method1();	//���õ�������n�ķ���
		new n().method2();	//ͬ�Ͻ���
	new jk2(){				//ʵ�ֽӿ��е�method1
		public void method1(){
			System.out.println("����Ƿ���һ���ⲿ���ʵ��");
		}
		public void method2(){
			System.out.println("����Ƿ��������ⲿ���ʵ��");
		}
		}.method1();
	new jk2(){				//ʵ�ֽӿ��е�method2
			public void method1(){
				System.out.println("����Ƿ���һ���ⲿ���ʵ��");
			}
			public void method2(){
				System.out.println("����Ƿ��������ⲿ���ʵ��");
			}
			}.method2();
	}
}
