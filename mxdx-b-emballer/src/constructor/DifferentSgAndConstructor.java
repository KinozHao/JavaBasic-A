/**
 * @author kinoz
 * @date 2022/3/27 - 21:19
 * @apiNote ���Ը�ֵ�����ַ�������
 */
package constructor;

public class DifferentSgAndConstructor {

	public static void main(String[] args) {
		//�ù�����
		persons a=new persons("CzZ",19);//�½�һ�����󣬲����вι�����и�ֵ����������
		a=new persons("������",16);//<1>�滻��,ʹ�ú�����ı���ֱ�ӱ�������,���ֲ��Ƽ�ʹ��
		System.out.println(a.getname()+"..."+a.getage());

		//��set get����
		persons b=new persons();//�޲ι���ͨ����Ա������
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
