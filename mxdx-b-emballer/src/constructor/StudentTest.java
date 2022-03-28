package constructor;
/**
 * @author kinoz
 * @date 2022/3/28 - 16:10
 * @apiNote 构造器学生类练习
 */
public class StudentTest {
	public static void main(String[] args) {
		student st = new student("JAM",18);
		System.out.println(st.Info());
		student st2 = new student("JAM",18,"Harvard");
		System.out.println(st2.Info());
		student st3 = new student("JAM",18,"Harvard","CS");
		System.out.println(st3.Info());
	}

}
class student{
	String name;
	int age;
	String school;
	String major;
	//构造器的重载更好的去体验它的用法
	public student(String MZ,int AG){
		name = MZ;
		age = AG;
	}
	public student(String MZ,int AG,String SC){
		name = MZ;
		age = AG;
		school =SC;
	}
	public student(String MZ,int AG,String SC,String MG){
		name = MZ;
		age = AG;
		school =SC;
		major = MG;
	}
	public String Info(){
		if (school == null){
			return name+"  "+age;
		}else if (major == null){
			return name+"  "+age+"  "+school;
		}else{
			return name+"  "+age+"  "+school+"  "+major;
		}
	}

}
