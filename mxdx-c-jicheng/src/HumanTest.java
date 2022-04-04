//封装类的具体理解，以及super的使用
public class HumanTest {
	public static void main(String[] args) {
		//工程师类
		Engineer engi = new Engineer();
		//虽然继承了human类，但是因human类属性是私有的，所以还是需要使用set get方法去调用
		engi.setName("Jam ");
		engi.setTel(545112656);
		String major = engi.major =" softwareEngineer";	//自己的属性

		System.out.println(engi.getName()+engi.getTel()+major);
		engi.learnITTechnology();	//自己的方法
		engi.study();				//继承父类的方法

		System.out.println("---------------------------------");

		//学生类
		CampusStudent cst = new CampusStudent();
		//学生类通过extends工程师类间接也是继承Human类的
		cst.setName("Wang");
		cst.setTel(1661321);
		String major2 = cst.major =" softwareEngineer";
		System.out.println(cst.getName()+cst.getTel()+major2);
		cst.JSEI();	//自己的方法
		cst.learnITTechnology();	//继承父类Engineer的方法
		cst.study();				//同时具备顶层父类Human的方法

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
	String major;	//自己特有属性
	public Engineer(){}

	public Engineer(String name,int tel){	// 调用父类的属性
		super(name,tel);
	}

	public void learnITTechnology(){	//特有方法
		System.out.println("every engineer need learn IT Technology");
	}
}

class CampusStudent extends Engineer{
	String major;	//自己特有属性
	public CampusStudent(){}
	public CampusStudent(String name,int tel,String major){	//调用父类的属性
		super(name,tel);
	}
	public void JSEI(){	//特有方法
		System.out.println("i's a  collage student at jsei");
	}
}