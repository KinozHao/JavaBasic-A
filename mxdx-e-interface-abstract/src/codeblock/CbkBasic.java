package codeblock;

public class CbkBasic {
	//1 ��̬����� ������������ִ��
	static{
		System.out.println("��̬����飬һֱ���ڿ���̨����㣡��������");
	}
	public static void main(String[] args) {
		//2 �ֲ������ ����ӡ�������������޷���������,��for�������
		{
			int x=10;
			System.out.println(x);
		}
		LeiA s=new LeiA();
		System.out.println("------");
		LeiA s2=new LeiA("zhangsan",23);
		System.out.println("------");
		LeiA s3=new LeiA();
		System.out.println("------");
		LeiA s4=new LeiA("zhangsan",23);
	}

}
class LeiA {
	private String name;
	private int age;
	public LeiA(){
		System.out.println("�ղι���");
	}
	public LeiA(String name, int age){
		this.name=name;
		this.age=age;
		System.out.println("�вι���");
	}
	//3 ��������
	{
		study(); //ִ��study()����ÿ�οɳ��������Ϸ��������ε���
	}
	public void study(){
		System.out.println("ѧ��ѧϰ");
	}
	/**
	 * 	��̬�����
	 * 	����:����������г�ʼ��,һ��������������
	 * 	������ļ��ض�����,��ִֻ��һ��
	 */
	static{
		System.out.println("LeiA���е�static�����");
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}