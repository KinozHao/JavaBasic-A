package codeblock;

public class CodeBlockBasic {
	public static void main(String[] args) {
		{
			int x=10;
			System.out.println(x);
		}
		//���Ͼ���һ���ֲ������ ����ӡ�������������޷���������,��for�������.
		a s=new a();
		System.out.println("------");
		a s2=new a("zhangsan",23);
		System.out.println("------");
		a s3=new a();
		System.out.println("------");
		a s4=new a("zhangsan",23);
	}
	static{
		System.out.println("���Ǿ�̬������");//������������ִ��
	}
}
class a{
	private String name;
	private int age;
	public a(){
		System.out.println("�ղι���");
	}//�ղι���
	public a(String name,int age){//�вι���
		this.name=name;
		this.age=age;
		System.out.println("�вι���");
	}
	//setxxx getxx����
	public void setname(String name){
		this.name=name;
	}
	public String getname(){
		return name;
	}
	public void setage(int age){
		this.age=age;
	}
	public int getage(){
		return age;
	}
	{
		study(); //��������ִ��study()�����ȿ���ÿ�γ��������Ϸ��������Դ˵��ö��.
	}
	public void study(){
		System.out.println("ѧ��ѧϰ");
	}
	//��̬�����
	static{//������ļ��ض�����,��ִֻ��һ��
		System.out.println("���Ǿ�̬������");//����:����������г�ʼ��,һ��������������
	}

}