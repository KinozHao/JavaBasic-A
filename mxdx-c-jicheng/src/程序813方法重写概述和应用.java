public class ����813������д������Ӧ�� {
	public static void main(String[] args) {
		ios8 s=new ios8();//New Object 
		s.accept();//��Ա����
		s.call();//	��Ա����
	}
}
class ios7{
	public void call(){
		System.out.println("��绰");
	}
	public void accept(){
		System.out.println("ios7just can English");
	}
}
class ios8 extends ios7{
	public void accept(){
	//super���ø����Ա����ʹiosϵͳ���Լ���֧��English
		super.accept();
	//��������°汾��ios֧���˶����ĵ�֧��
	System.out.println("ios8this version can take with chinese");
	}
}