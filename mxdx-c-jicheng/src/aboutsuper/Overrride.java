package aboutsuper;
//������д������Ӧ��
public class Overrride {
	public static void main(String[] args) {
		bmw bm = new bmw();
		bm.drive();
		bm.color();

		bm.autopilot();
	}
}

class car{
	String logo;
	int tel;

	public car(){

	}

	public car(String logo, int tel) {
		this.logo = logo;
		this.tel = tel;
	}

	public void drive(){
		System.out.println("every car can drive");
	}

	public void color(){
		System.out.println("every car have a lot of colors");
	}

	public static void aboutStatic(){	//������static�����򲻻ṹ�ɷ�������д
		System.out.println("111");
	}
	public Object aboutParamType(){		//object����
		System.out.println("objects");
		return null;
	}
}

class bmw extends car{
	//��ʱ������д ��ΪString��object������
	@Override
	public String aboutParamType() {
		return null;
	}
	//��û���ɷ�������д
	public static void  aboutStatic(){}

	String country;

	public bmw(){

	}

	public bmw(String country) {
		this.country = country;
	}

	//����Ը��෽������д
	public void color(){
		System.out.println("we supply gold pink white black etc 8 colors for your choose. ");
	}

	public void autopilot(){
		System.out.println("new tec bmw have autopilot car !");
	}
}