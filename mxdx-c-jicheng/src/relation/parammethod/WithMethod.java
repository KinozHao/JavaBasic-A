package relation.parammethod;
//�뷽���Ĺ�ϵ
public class WithMethod {
	public static void main(String[] args) {
		zisaka s=new zisaka();
		s.print();
		s.method();
	}

}
class fukasi{
	public void print(){
		System.out.println("FU PRINT");
	}
}
class zisaka extends fukasi{
	public void method(){
		System.out.println("ZI METHOD");
	}
	public void print(){
		super.print();//super ���ø��෽��
		//��Ϊ������ø��� ��������print��Ա������ִ�� method��Ա������ִ��
		System.out.println("ZI PRINT");//�������͸�����ͬ���ĳ�Ա���� ������ָ���(��д)��
	}
}