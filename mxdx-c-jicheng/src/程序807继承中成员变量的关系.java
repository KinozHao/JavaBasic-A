public class ����807�̳��г�Ա�����Ĺ�ϵ {
	public static void main(String[] args) {
		son s=new son();
		s.runs();
	}
}
class father{
	int num=10;
	int num1=203;
}
class son extends father{
	int num1=20;
	public void runs(){
		System.out.println(this.num);//�Ӹ��಻ͬ���ı���
		System.out.println(this.num1);//�ڶ������Ϊ20��Ϊ203 Ϊʲô ��Ϊ�ͽ�ԭ��
		System.out.println(super.num1);
		//this���ñ���,Ҳ���Ե��ø���(����û�е������) super���ø���
	}
}