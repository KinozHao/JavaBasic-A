package dkeyword;
/**
 * @apiNote static�ؼ���ʹ��
 * */
public class StaticBasic {
	public static void main(String[] args) {
		lei k=new lei();//��������
		k.name="Kito";//�����������Բ��Ҹ�ֵ
		k.country="japan";//���ù������Բ��Ҹ�ֵ
		k.runs();//����runs��ӡ���


		lei k2=new lei();
		k2.name="������";
		k2.runs();//����runs��ӡ���
		lei.country="Japan";//��̬����һ�ֵ���,����ͨ������
	}

}
class lei{
	String name;
	static String country;//��ֻ̬�ܷ��ʾ�̬���� ��ֻ̬�ܷ��ʾ�̬����
	public void runs(){//��ӡ���
		System.out.println(name+"..."+country);
	}
}
