package keyword;
//final�ؼ������ξֲ�����
public class FinalBasicTwo {
	public static void main(String[] args) {
		final int NUM=10;	//�������� ��ֵ���ܱ��ı�
		System.out.println(NUM);
		final s820 s=new s820("������",16);
		//�������� �ǵ�ֵַ���ܱ��ı� �����е����Կ��Ըı�
		//s=new keyword.s820("*zz",17)
		s.setname("*zz");
		s.setage(17);
		System.out.println(s.getname()+"this year is"+s.getage());
		//������ ÿ�λᵯջ�ͷ� ����ÿ�δ�ӡ����ͬ
		mathod(10);
		mathod(100);
	}
	//���岻�� �����к�����ô��
	public static void mathod(int x){
		System.out.println(x);
	}
}
class s820{
	private String name;
	private int age;
	public s820(){
		
	}
	public s820(String name,int age){
		this.name=name;
		this.age=age;
	}
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
}
