                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            package basic;
public class DuotBasicII {
	public static void main(String[] args) {
		peoples ss=new japan();;
		//����ʱ������ڴ��������ʱ���ø�������ָ���������,ֱ�Ӵ���������������
		//����ʹ�����������е����Ժ���Ϊ
		//��������
		mathod(new japan());
		mathod(new china());
	}
	//������ʹ��
//	public static void mathod(japan c){
//		c.person();
//	}
//	public static void mathod(china d){
//		d.person();
//	}
	//����������ʱ���ò������,ӦΪ��չ��ǿ
	public static void mathod(peoples e){//���ø��෽��
		//e.eatj();	//�����޷�ʹ�������Ա���� ����ڸ�����дһ���Ļ�Ҳ������
		e.person();
		/*If you want all of the countrys eat the Sushi not ture
		 a type conversion exception will occur"ClassCastException"*/
		/*japan f=(japan)e;
		f.person();
		f.eatj();*/
		//�ؼ���instanceof �ж�ǰ��������Ƿ��Ǻ������������
		//����һ�㲻��ôʹ�� ֱ�ӽ��ܸ������� ����Ӧ�������ͼ���
		if(e instanceof japan){
			japan g=(japan)e;
			g.person();
			g.eatj();
		}else if(e instanceof china){
			china h=(china)e;
			h.person();
			h.eatc();
		}else{
			e.person();
		}
	}
}
class peoples{//����
	public void person(){
		System.out.println("all of yours are person");
	}
}
class japan extends peoples{//�Ӽ̳и���
	public void person(){
		//super.person();	super���ø����Ա����
		System.out.println("I,m japanese");
	}
	public void eatj(){
		System.out.println("We eat Sushi");
	}
}
class china extends peoples{
	public void person(){
		System.out.println("I,m Chinese");
	}
	public void eatc(){
		System.out.println("We eat jiaozi");
	}
}