public class ����703��Ա������ֵ�����ַ������� {

	public static void main(String[] args) {
		persons a=new persons("CzZ",19);//�½�һ�����󣬲����вι�����и�ֵ����������
		a=new persons("������",16);//<1>�滻��,ʹ�ú�����ı���ֱ�ӱ�������,���ֲ��Ƽ�ʹ��
		System.out.println(a.getname()+"..."+a.getage());
		persons b=new persons();//�޲ι���ͨ����Ա�����ĵڶ��ַ���setxxx getxx ���ж��丳ֵ
		b.setage(199);  //��������
		b.setname("koko");//��������
		b.setname("coco");//<2>�滻���������Ƽ�ʹ��
		System.out.println(b.getname()+"..."+b.getage());
	}

}
class persons{
	private String name;
	private int age;
	public persons(){}//�޲ι���
	public persons(String name,int age){//�вι���
		this.name=name;
		this.age=age;
	}
	public void setage(int age){//��������
		this.age=age;
	}
	public int getage(){//��������ֵ
		return age;
	}
	public void setname(String name){//��������
		this.name=name;
	}
	public String getname(){//��������ֵ
		return name;
	}
}
