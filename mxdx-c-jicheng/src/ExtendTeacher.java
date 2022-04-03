 public class ExtendTeacher {
	public static void main(String[] args) {
		teacher ter=new teacher();
		ter.setName("Cherry");
		ter.setTel("12342135632");
		ter.keepLearn();
		ter.teach();
		System.out.println(" Teacher: "+ter.getName()+" Tel:"+ter.getTel());

		System.out.println("----------------------------");

		students stu =new students("Sahara","18878445157");
		stu.keepLearn();
		stu.study();
		System.out.println(" Student: "+stu.getName()+" Tel:"+stu.getTel());

	}

}
class person{
	private String name;	//名称
	private String tel;		//电话
	public person(){}
	public person(String name,String tel){
		this.name = name;
		this.tel = tel;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setTel(String tel){
		this.tel =tel;
	}
	public String getTel(){
		return tel;
	}

	public void keepLearn(){
		System.out.println("every one need keep learn.");
	}
}
class teacher extends person{
	public teacher(){}
	public teacher(String name,String tel){	//通过super调用父类
		super(name,tel);
	}
	public void teach(){	//teacher类自己的方法
		System.out.println(this.getName()+"teach students");
	}
}
class students extends person{
	public students(){}
	public students(String name,String tel){
		super(name,tel);
	}
	public void study(){
		System.out.println(this.getName()+"study knowledge");
	}
}
