//Ҫ���Դ���� 20 10 30 Ӧ����ô��д�˴���
public class ����111��Ա�ڲ���������� {
	public static void main(String[] args) {
		fang(new wai().new nei());
	}
	public static void fang(wai.nei a){
		a.method();
	}
}
//�ڲ���֮�����ܻ�ȡ�õ��ⲿ��ĳ�Ա
//����Ϊ�����ܻ�õ��ⲿ��������ⲿ����.this  
class wai{
	int num=30;	//�ⲿ�����
	class nei{
		public int num=10;//�ڲ������
		public void method(){
			int num=20;		//�����ڵı���
			System.out.println(num);	//�ͽ�ԭ��
			System.out.println(this.num);//������� this.����
			System.out.println(wai.this.num);
		}
	}
}
