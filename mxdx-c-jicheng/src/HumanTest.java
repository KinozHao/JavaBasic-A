//��װ��ľ�����⣬�Լ�super��ʹ��
public class HumanTest {
	public static void main(String[] args) {
		//����ʦ��
		Engineer engi = new Engineer();
		//��Ȼ�̳���human�࣬������human��������˽�еģ����Ի�����Ҫʹ��set get����ȥ����
		engi.setName("Jam ");
		engi.setTel(545112656);
		String major = engi.major =" softwareEngineer";	//�Լ�������

		System.out.println(engi.getName()+engi.getTel()+major);
		engi.learnITTechnology();	//�Լ��ķ���
		engi.study();				//�̳и���ķ���

		System.out.println("---------------------------------");

		//ѧ����
		CampusStudent cst = new CampusStudent();
		//ѧ����ͨ��extends����ʦ����Ҳ�Ǽ̳�Human���
		cst.setName("Wang");
		cst.setTel(1661321);
		String major2 = cst.major =" softwareEngineer";
		System.out.println(cst.getName()+cst.getTel()+major2);
		cst.JSEI();	//�Լ��ķ���
		cst.learnITTechnology();	//�̳и���Engineer�ķ���
		cst.study();				//ͬʱ�߱����㸸��Human�ķ���

	}

}
class Human {
	//property
	private String name;
	private int tel;

	public Human(){}
	public Human(String name,int tel){
		this.name = name;
		this.tel = tel;
	}

	public void study(){
		System.out.println("every human can keep study");
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}
}

class Engineer extends Human{
	String major;	//�Լ���������
	public Engineer(){}

	public Engineer(String name,int tel){	// ���ø��������
		super(name,tel);
	}

	public void learnITTechnology(){	//���з���
		System.out.println("every engineer need learn IT Technology");
	}
}

class CampusStudent extends Engineer{
	String major;	//�Լ���������
	public CampusStudent(){}
	public CampusStudent(String name,int tel,String major){	//���ø��������
		super(name,tel);
	}
	public void JSEI(){	//���з���
		System.out.println("i's a  collage student at jsei");
	}
}